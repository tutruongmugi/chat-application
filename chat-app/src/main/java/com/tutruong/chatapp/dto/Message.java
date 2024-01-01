package com.tutruong.chatapp.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String sender;
    private String content;
    private String timestamp;
}
