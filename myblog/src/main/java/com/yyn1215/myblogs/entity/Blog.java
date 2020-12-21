package com.yyn1215.myblogs.entity;


import com.baomidou.mybatisplus.annotation.TableField;
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

    private String id;

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

    private String typeId;

    private String userId;

    private Integer commentCount;

    private Boolean deleteFlag;

    @TableField(exist = false)
    private Type type;

    @TableField(exist = false)
    private User user;

    @TableField(exist = false)
    private List<Comment> comments = new ArrayList<>();

}
