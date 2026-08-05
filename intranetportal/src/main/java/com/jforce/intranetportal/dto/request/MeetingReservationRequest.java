package com.jforce.intranetportal.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class MeetingReservationRequest {

    @NotNull(message = "Meeting room id cannot be null")
    private Long meetingRoomId;

    @NotBlank(message = "Meeting room title cannot be blank")
    private String title;

    @NotNull(message = "Reservation date cannot be null")
    private LocalDate reservationDate;

    @NotNull(message = "Start time cannot be null")
    private LocalTime startTime;

    @NotNull(message = "End time cannot be null")
    private LocalTime endTime;
}
