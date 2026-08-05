package com.jforce.intranetportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "equipment_assignment")
@NamedEntityGraph(
        name = "EquipmentAssignment.withEmployeeAndEquipment",
        attributeNodes = {
                @NamedAttributeNode("employee"),
                @NamedAttributeNode("equipment")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @NotNull(message = "Delivery date cannot be null")
    @Column(name = "delivery_date", nullable = false)
    private LocalDate deliveryDate;

    @Column(name = "return_date")
    private LocalDate returnDate;
}
