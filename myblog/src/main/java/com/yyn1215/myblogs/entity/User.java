package com.yyn1215.myblogs.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author yyn
 * @since 2020-12-07
 */
@Data
public class User {

    private static final long serialVersionUID = 1L;

    private String id;

    private String avatar;

    private LocalDateTime createTime;

    private String email;

    private String nickname;

    private String password;

    private Integer type;

    private LocalDateTime updateTime;

    private String username;


}
