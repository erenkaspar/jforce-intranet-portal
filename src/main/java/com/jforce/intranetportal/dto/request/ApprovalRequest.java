package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.ApprovalStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ApprovalRequest {

    @NotNull(message = "Request id cannot be null")
    private Long id;

    @NotNull(message = "Approval status cannot be null")
    private ApprovalStatus status;
}
