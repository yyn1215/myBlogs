package com.yyn1215.myblogs.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.entity.Friend;
import com.yyn1215.myblogs.mapper.FriendMapper;
import com.yyn1215.myblogs.service.FriendService;
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
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements FriendService {

}
