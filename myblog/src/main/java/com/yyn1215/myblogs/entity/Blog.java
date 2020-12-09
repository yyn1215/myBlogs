package com.yyn1215.myblogs.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
public class Blog {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Boolean appreciation;

    private Boolean commentabled;

    private String content;

    private LocalDateTime createTime;

    private String description;

    private String firstPicture;

    private String flag;

    private Boolean published;

    private Boolean recommend;

    private Boolean shareStatement;

    private String title;

    private LocalDateTime updateTime;

    private Integer views;

    private Long typeId;

    private Long userId;

    private Integer commentCount;

    private List<Comment> comments = new ArrayList<>();

}
