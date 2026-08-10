package com.jforce.intranetportal.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeAdminUpdateRequest {

    @NotNull(message = "Employee id cannot be null")
    private Long id;

    @Size(max = 50, message = "First name cannot exceed 50 characters")
    private String name;

    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    private String surname;

    @Email(message = "Invalid email format")
    @Size(max = 100, message = "Email cannot exceed 100 characters")
    private String email;

    @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
    private String password;

    private Integer departmentId;
    private Boolean isActive = true;
}
