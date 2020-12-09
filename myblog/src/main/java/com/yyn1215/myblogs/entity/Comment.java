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
public class Comment {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private LocalDateTime createTime;

    private Long blogId;

    private Long parentCommentId;

    private Boolean adminComment;

    //回复评论
    private List<Comment> replyComments = new ArrayList<>();

    private Comment parentComment;

    private String parentNickname;

}
