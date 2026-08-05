package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.EquipmentStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EquipmentUpdateRequest {

    @NotNull(message = "Equipment id cannot be null")
    private Long id;

    private String brand;
    private String model;
    private String serialNumber;
    private EquipmentStatus equipmentStatus;
}
