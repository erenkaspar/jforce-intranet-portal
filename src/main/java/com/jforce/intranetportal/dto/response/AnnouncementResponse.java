package com.jforce.intranetportal.dto.response;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class AnnouncementResponse {
    private Long id;
    private String title;
    private String content;
    private String authorFullName;
    private String profilePhoto;
    private LocalDateTime createdAt;
    private Long likeCount;
    private Long commentCount;
    private Boolean isLikedByMe;
    private List<CommentResponse> comments;
}
