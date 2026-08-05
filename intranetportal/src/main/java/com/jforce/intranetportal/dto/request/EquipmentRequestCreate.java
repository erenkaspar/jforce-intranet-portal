package com.jforce.intranetportal.dto.request;

import com.jforce.intranetportal.entity.EquipmentType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EquipmentRequestCreate {

    @NotNull(message = "Equipment type cannot be null")
    private EquipmentType equipmentType;
}
