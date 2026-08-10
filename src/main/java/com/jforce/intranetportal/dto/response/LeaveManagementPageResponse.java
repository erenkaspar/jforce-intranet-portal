package com.jforce.intranetportal.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LeaveManagementPageResponse {

    private Integer remainingLeaveDays;
    private List<LeaveRequestResponse> pastRequests;
}
