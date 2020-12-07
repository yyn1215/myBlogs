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
public class TFriend {

    private static final long serialVersionUID = 1L;

    private String blogaddress;

    private String blogname;

    private LocalDateTime createTime;

    private String pictureaddress;


}
