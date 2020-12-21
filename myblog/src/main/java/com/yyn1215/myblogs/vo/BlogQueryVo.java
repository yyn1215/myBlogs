package com.yyn1215.myblogs.vo;

import com.yyn1215.myblogs.entity.Type;
import lombok.Data;

import java.util.Date;

@Data
public class BlogQueryVo  {

    private String id;

    private String title;

    private Date updateTime;

    private Boolean recommend;

    private Boolean published;

    private String typeId;

    private Type type;

}
