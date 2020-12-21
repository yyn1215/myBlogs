package com.yyn1215.myblogs.service.impl;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.Exception.NotFoundException;
import com.yyn1215.myblogs.entity.Blog;
import com.yyn1215.myblogs.entity.Type;
import com.yyn1215.myblogs.mapper.BlogMapper;
import com.yyn1215.myblogs.service.BlogService;
import com.yyn1215.myblogs.service.TypeService;
import com.yyn1215.myblogs.vo.BlogQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Autowired
    TypeService typeService;

    //保存新增博客
    @Override
    public int saveBlog(Blog blog) {
        blog.setCreateTime(LocalDateTime.now());
        blog.setUpdateTime(LocalDateTime.now());
        blog.setViews(0);
        blog.setCommentCount(0);
        return save(blog) ? 1 : 0;
    }

    //查询文章管理列表
    @Override
    public List<BlogQueryVo> getAllBlog() {
        List<Blog> blogQueryVos = list();
        List<Type> types = typeService.getAllType();
        List<BlogQueryVo> blogQueryVoList = new ArrayList<>();
        for (Blog blog : blogQueryVos) {
            BlogQueryVo blogQueryVo = new BlogQueryVo();
            BeanUtil.copyProperties(blog, blogQueryVo);
            for (Type type : types) {
                if (blog.getTypeId().equals(type.getId())) {
                    blogQueryVo.setType(type);
                    break;
                }
            }
            blogQueryVoList.add(blogQueryVo);
        }
        return blogQueryVoList;
    }

    /**
     * @param id
     */
    @Override
    public void deleteBlog(String id) {
        Blog blog = selectBlog(id).get();
        blog.setDeleteFlag(Boolean.FALSE);
        updateById(blog);
    }

    /**
     * 查询博客
     *
     * @param id
     * @return
     */
    @Override
    public Optional<Blog> selectBlog(String id) {
        QueryWrapper<Blog> blogQueryWrapper = new QueryWrapper<>();
        blogQueryWrapper.lambda().eq(Blog::getId, id).eq(Blog::getDeleteFlag, Boolean.FALSE);

        Blog blog = getOne(blogQueryWrapper,Boolean.TRUE);
        if (ObjectUtil.isNull(blog)){
            throw new NotFoundException("blog not found");
        }
        return Optional.ofNullable(blog);
    }

    @Override
    public Blog getBlogById(String id) {
        return selectBlog(id).get();
    }

    @Override
    public int updateBlog(Blog blog) {
        return updateById(blog) ? 1 : 0;
    }

    @Override
    public List<BlogQueryVo> searchByTitleAndType(Blog searchBlog) {
        QueryWrapper<Blog> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StrUtil.isNotBlank(searchBlog.getTitle()),"title",searchBlog.getTitle());
        queryWrapper.lambda().eq(Blog::getTypeId,searchBlog.getTypeId());
        List<Blog> blogs = blogMapper.selectList(queryWrapper);
        List<Type> types = typeService.getAllType();
        List<BlogQueryVo> blogQueryVoList = new ArrayList<>();
        for (Blog blog : blogs) {
            BlogQueryVo blogQueryVo = new BlogQueryVo();
            BeanUtil.copyProperties(blog, blogQueryVo);
            for (Type type : types) {
                if (blog.getTypeId().equals(type.getId())) {
                    blogQueryVo.setType(type);
                    break;
                }
            }
            blogQueryVoList.add(blogQueryVo);
        }
        return blogQueryVoList;
    }

}
