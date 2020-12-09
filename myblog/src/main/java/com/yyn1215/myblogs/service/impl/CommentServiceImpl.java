package com.yyn1215.myblogs.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.entity.Comment;
import com.yyn1215.myblogs.mapper.CommentMapper;
import com.yyn1215.myblogs.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
