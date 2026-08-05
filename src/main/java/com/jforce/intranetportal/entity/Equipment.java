package com.jforce.intranetportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "equipments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "equipment_type", length = 20)
    private EquipmentType equipmentType;

    @Size(max = 100, message = "Brand cannot exceed 100 characters")
    @Column(name = "brand", length = 100)
    private String brand;

    @Size(max = 100, message = "Model cannot exceed 100 characters")
    @Column(name = "model", length = 100)
    private String model;

    @NotNull(message = "Serial number cannot be null")
    @Size(max = 100, message = "Serial number cannot exceed 100 characters")
    @Column(name = "serial_number", nullable = false, unique = true, length = 100)
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private EquipmentStatus status = EquipmentStatus.IN_STORAGE;

    @OneToMany(mappedBy = "equipment", fetch = FetchType.LAZY)
    private List<EquipmentRequest> equipmentRequests;

    @OneToMany(mappedBy = "equipment", fetch = FetchType.LAZY)
    private List<EquipmentAssignment> equipmentAssignments;
}
