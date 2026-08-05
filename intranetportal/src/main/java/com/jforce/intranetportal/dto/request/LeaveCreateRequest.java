package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.LeaveType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveCreateRequest {

    @NotNull(message = "Leave type cannot be null")
    private LeaveType leaveType;

    @NotNull(message = "Start date cannot be null")
    @FutureOrPresent(message = "Leave date cannot be in the past")
    private LocalDate startDate;

    @NotNull(message = "End date cannot be null")
    @FutureOrPresent(message = "Leave date cannot be in the past")
    private LocalDate endDate;

    @Size(max = 400, message = "Request note cannot exceed 400 characters")
    private String requestNote;
}
