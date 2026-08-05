package com.jforce.intranetportal.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AnnouncementCreateRequest {

    @NotBlank(message = "Title cannot be blank")
    @Size(max = 400, message = "Title cannot exceed 400 characters")
    private String title;

    @NotBlank(message = "Content cannot be blank")
    @Size(max = 2000, message = "Content cannot exceed 2000 characters")
    private String content;
}
