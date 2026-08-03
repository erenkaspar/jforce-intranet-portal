package com.jforce.intranetportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

//Entity olduğunu hibernate'e bildirir
@Entity
//Hangi tabloyla eşleşeceği
@Table(name = "employee")
@NamedEntityGraph(
        name = "Employee.withDepartment",
        attributeNodes = {
                @NamedAttributeNode("department"),
        }
)
//Get set oto oluşturma
@Getter
@Setter
//Parametresiz bir constructor (yapıcı metot) oluşturur (JPA/Hibernate'in nesne oluşturabilmesi için zorunludur).
@NoArgsConstructor
//Tüm değişkenleri içeren parametreli bir constructor oluşturur.
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name cannot be blank")
    @Size(max = 50, message = "First name cannot exceed 50 characters")
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @NotNull(message = "Birth date cannot be null")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    @Size(max = 100, message = "Email cannot exceed 100 characters")
    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @NotNull(message = "Registration number cannot be null")
    @Column(name = "registration_number", nullable = false, unique = true)
    private Integer registrationNumber;

    @NotNull(message = "Department cannot be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @NotNull(message = "Role cannot be null")
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 20)
    private Role role = Role.EMPLOYEE;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeSkill> employeeSkills;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<LeaveRequest> leaveRequests;

    @OneToMany(mappedBy = "approver", fetch = FetchType.LAZY)
    private List<LeaveRequest> managedLeaveRequests;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<MeetingReservation> meetingReservations;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EquipmentRequest> equipmentRequests;

    @OneToMany(mappedBy = "approver", fetch = FetchType.LAZY)
    private List<EquipmentRequest> managedEquipmentRequests;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EquipmentAssignment> equipmentAssignments;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Announcement> announcements;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Comment> comments;

    @OneToMany(mappedBy = "liker", fetch = FetchType.LAZY)
    private List<AnnouncementLike> announcementLikes;
}