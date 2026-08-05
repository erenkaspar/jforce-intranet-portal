package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.EmployeeSkill;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ProfileUpdateRequest {

    @NotNull(message = "Employee id cannot be null")
    private Long id;

    @Size(max = 50, message = "First name cannot exceed 50 characters")
    private String name;

    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    private String surname;

    private LocalDate birthDate;

    @Email(message = "Invalid email format")
    @Size(max = 100, message = "Email cannot exceed 100 characters")
    private String email;

    private List<EmployeeSkill> employeeSkills;
}
