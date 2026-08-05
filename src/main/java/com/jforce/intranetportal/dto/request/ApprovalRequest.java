package com.jforce.intranetportal.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalTime;

@Data
public class ApprovalRequest {

    @NotNull(message = "Request id cannot be null")
    private Long id;

    @NotNull(message = "Approval status cannot be null")
    private Boolean isApproved;
}
