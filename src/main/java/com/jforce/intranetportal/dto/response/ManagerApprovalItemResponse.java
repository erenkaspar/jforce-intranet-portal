package com.jforce.intranetportal.dto.response;

import com.jforce.intranetportal.entity.ApprovalStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ManagerApprovalItemResponse {

    private Long id;
    private String requestType;
    private String employeeFullName;
    private String details;
    private ApprovalStatus status;
}
