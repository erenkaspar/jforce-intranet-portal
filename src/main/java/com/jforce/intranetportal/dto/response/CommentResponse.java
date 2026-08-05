package com.jforce.intranetportal.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentResponse {

    private Long id;
    private String authorFullName;
    private String content;
    private LocalDateTime createdAt;
}
