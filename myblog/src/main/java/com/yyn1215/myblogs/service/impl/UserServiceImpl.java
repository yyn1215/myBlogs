package com.yyn1215.myblogs.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyn1215.myblogs.entity.User;
import com.yyn1215.myblogs.mapper.UserMapper;
import com.yyn1215.myblogs.service.UserService;
import com.yyn1215.myblogs.util.MD5Utils;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Optional<User> checkUser(String username, String password, Boolean throwEx)  {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUsername, username)
                .eq(User::getPassword, MD5Utils.code(password));

        User user = getOne(queryWrapper);
        if (throwEx && ObjectUtil.isNull(user)) {
            log.error("password error");
        }
        return Optional.ofNullable(user);
    }
}
