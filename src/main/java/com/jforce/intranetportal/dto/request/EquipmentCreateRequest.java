package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.EquipmentType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class EquipmentCreateRequest {

    @NotNull(message = "Equipment type cannot be null")
    private EquipmentType equipmentType;

    @Size(max = 100, message = "Brand cannot exceed 100 characters")
    private String brand;

    @Size(max = 100, message = "Model cannot exceed 100 characters")
    private String model;

    @NotBlank(message = "Serial number cannot be blank")
    @Size(max = 100, message = "Serial number cannot exceed 100 characters")
    private List<String> serialNumbers;
}
