package com.jforce.intranetportal.dto.response;

import com.jforce.intranetportal.entity.ApprovalStatus;
import com.jforce.intranetportal.entity.EquipmentType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class DashboardResponse {

    private AnnouncementSummary latestAnnouncement;
    private List<MeetingReservationResponse> todayMeetings;
    private List<TeamDirectorySummary> teamDirectory;
    private List<BirthdaySummary> birthdaysToday;
    private LeaveSummaryResponse leaveSummary;
    private List<EquipmentRequestSummary> equipmentRequests;
    private List<AppreciationSummary> recentAppreciations;

    @Data
    @Builder
    public static class AnnouncementSummary {
        private Long id;
        private String title;
        private String authorDepartment;
        private LocalDateTime createdAt;
    }

    @Data
    @Builder
    public static class MeetingReservationResponse {
        private Long id;
        private String roomName;
        private String title;
        private String timeRange;
    }

    @Data
    @Builder
    public static class TeamDirectorySummary {
        private Long id;
        private String fullName;
        private String department;
        private List<String> skills;
        private String profilePhotoUrl;
    }

    @Data
    @Builder
    public static class BirthdaySummary {
        private String fullName;
        private String department;
        private LocalDate birthDate;
        private String profilePhoto;
    }

    @Data
    @Builder
    public static class LeaveSummaryResponse {
        private Integer remainingLeaveDays;
        private Integer onLeaveTodayCount;
    }

    @Data
    @Builder
    public static class EquipmentRequestSummary {
        private Long id;
        private EquipmentType equipmentType;
        private ApprovalStatus status;
    }

    @Data
    @Builder
    public static class AppreciationSummary {
        private Long id;
        private String content;
        private String senderName;
    }

}
