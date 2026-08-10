package com.jforce.intranetportal.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class MeetingRoomPageResponse {

    private LocalDate reservationDate;
    private List<RoomScheduleResponse> rooms;

    @Data
    @Builder
    public static class RoomScheduleResponse {
        private Long roomId;
        private String roomName;
        private List<ReservationDetailResponse> reservations;
    }

    @Data
    @Builder
    public static class ReservationDetailResponse {
        private Long id;
        private String title;
        private LocalTime startTime;
        private LocalTime endTime;
    }
}