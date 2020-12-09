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
public class Message {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private LocalDateTime createTime;

    private Long parentMessageId;

    private Boolean adminMessage;

    //回复留言
    private List<Message> replyMessages = new ArrayList<>();

    private Message parentMessage;

    private String parentNickname;

}
