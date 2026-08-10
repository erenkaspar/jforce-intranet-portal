package com.jforce.intranetportal.dto.response;

import com.jforce.intranetportal.entity.Role;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EmployeeResponse {

    private Long id;
    private String profilePhoto;
    private String fullName;
    private LocalDate  dateOfBirth;
    private String department;
    private Role role;
}
