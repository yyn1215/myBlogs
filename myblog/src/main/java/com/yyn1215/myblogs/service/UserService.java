package com.yyn1215.myblogs.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yyn1215.myblogs.entity.User;

import java.util.Optional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
public interface UserService extends IService<User> {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    Optional<User> checkUser(String username , String password, Boolean throwEx);

}
