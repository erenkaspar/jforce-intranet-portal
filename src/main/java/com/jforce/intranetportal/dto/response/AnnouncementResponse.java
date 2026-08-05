package com.jforce.intranetportal.dto.response;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AnnouncementResponse {
    private Long id;
    private String title;
    private String content;
    private String authorFullName;
    private LocalDateTime createdAt;
}
