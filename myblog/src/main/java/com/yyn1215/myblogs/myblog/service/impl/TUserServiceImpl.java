package com.yyn1215.myblogs.myblog.service.impl;

import com.yyn1215.myblogs.myblog.entity.TUser;
import com.yyn1215.myblogs.myblog.mapper.TUserMapper;
import com.yyn1215.myblogs.myblog.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
