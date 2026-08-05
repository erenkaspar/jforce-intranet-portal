package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.Department;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmployeeManagerUpdateRequest {

    @NotNull(message = "Employee id cannot be null")
    private Long id;

    private Department department;
    private Boolean isActive = true;
}
