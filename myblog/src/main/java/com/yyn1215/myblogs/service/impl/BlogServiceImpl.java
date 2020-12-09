package com.yyn1215.myblogs.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.entity.Blog;
import com.yyn1215.myblogs.mapper.BlogMapper;
import com.yyn1215.myblogs.service.BlogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
