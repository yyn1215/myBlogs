package com.yyn1215.myblogs.myblog.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class TPicture {

    private static final long serialVersionUID = 1L;

    private String pictureaddress;

    private String picturedescription;

    private String picturename;

    private String picturetime;


}
