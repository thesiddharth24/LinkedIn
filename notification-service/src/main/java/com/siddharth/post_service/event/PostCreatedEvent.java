package com.siddharth.post_service.event;

import lombok.Data;

@Data
public class PostCreatedEvent {

    Long creatorId;
    String content;
    Long postId;
}
