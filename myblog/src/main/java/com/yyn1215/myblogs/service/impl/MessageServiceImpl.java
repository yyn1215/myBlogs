package com.yyn1215.myblogs.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.entity.Message;
import com.yyn1215.myblogs.mapper.MessageMapper;
import com.yyn1215.myblogs.service.MessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
