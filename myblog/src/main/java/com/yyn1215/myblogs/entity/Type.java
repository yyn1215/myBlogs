package com.yyn1215.myblogs.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Type {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    @TableField(exist = false)
    private List<Blog> blogs = new ArrayList<>();

}
