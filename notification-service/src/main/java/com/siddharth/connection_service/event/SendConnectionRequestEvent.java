package com.siddharth.connection_service.event;

import lombok.Builder;
import lombok.Data;

@Data
public class SendConnectionRequestEvent {
    private Long senderId;
    private Long receiverId;
}
