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
public class TComment {

    private static final long serialVersionUID = 1L;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private LocalDateTime createTime;

    private Long blogId;

    private Long parentCommentId;

    private Boolean adminComment;


}
