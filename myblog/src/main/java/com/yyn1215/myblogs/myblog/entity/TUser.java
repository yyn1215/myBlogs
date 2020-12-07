package com.yyn1215.myblogs.myblog.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode()
public class TUser {

    private static final long serialVersionUID = 1L;

    private String avatar;

    private LocalDateTime createTime;

    private String email;

    private String nickname;

    private String password;

    private Integer type;

    private LocalDateTime updateTime;

    private String username;


}
