package com.yyn1215.myblogs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yyn1215.myblogs.entity.Blog;
import com.yyn1215.myblogs.vo.BlogQueryVo;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
public interface BlogService extends IService<Blog> {

    /**
     * 保存新增博客
     *
     * @param blog
     * @return
     */
    int saveBlog(Blog blog);

    /**
     * 查询文章管理列表
     *
     * @return
     */
    List<BlogQueryVo> getAllBlog();

    /**
     * 删除博客
     *
     * @param id
     */
    void deleteBlog(String id);

    /**
     * 查询博客
     *
     * @param id
     * @return
     */
    Optional<Blog> selectBlog(String id);

    /**
     * 查询编辑修改的文章
     *
     * @param id
     * @return
     */
    Blog getBlogById(String id);

    /**
     * 编辑修改文章
     *
     * @param blog
     * @return
     */
    int updateBlog(Blog blog);

    /**
     * 搜索博客管理列表
     *
     * @param searchBlog
     * @return
     */
    List<BlogQueryVo> searchByTitleAndType(Blog searchBlog);
}
