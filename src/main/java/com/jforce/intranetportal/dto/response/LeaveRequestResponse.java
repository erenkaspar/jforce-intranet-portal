package com.jforce.intranetportal.dto.response;

import com.jforce.intranetportal.entity.ApprovalStatus;
import com.jforce.intranetportal.entity.LeaveType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveRequestResponse {

    private Long id;
    private LeaveType leaveType;
    private LocalDate startDate;
    private LocalDate endDate;
    private ApprovalStatus status;

}
