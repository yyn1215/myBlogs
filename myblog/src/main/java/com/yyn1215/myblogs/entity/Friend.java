package com.yyn1215.myblogs.entity;


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
public class Friend {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String blogaddress;

    private String blogname;

    private LocalDateTime createTime;

    private String pictureaddress;


}
