package com.jforce.intranetportal.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartmentCreateRequest {

    @NotBlank(message = "Department name cannot be blank")
    private String name;
}
