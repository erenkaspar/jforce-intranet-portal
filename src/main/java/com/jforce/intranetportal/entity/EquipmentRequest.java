package com.jforce.intranetportal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "equipment_request")
@NamedEntityGraph(
        name = "EquipmentRequest.withAllRelations",
        attributeNodes = {
                @NamedAttributeNode("employee"),
                @NamedAttributeNode("equipment"),
                @NamedAttributeNode("approver")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private ApprovalStatus status = ApprovalStatus.PENDING;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approver_id")
    private Employee approver;

    @Column(name = "action_date")
    private LocalDateTime actionDate;
}
