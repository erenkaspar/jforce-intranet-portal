package com.jforce.intranetportal.controller;

import com.jforce.intranetportal.dto.request.AnnouncementCreateRequest;
import com.jforce.intranetportal.dto.response.AnnouncementResponse;
import com.jforce.intranetportal.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/announcements")
@RequiredArgsConstructor
public class AnnouncementController {
    private final AnnouncementService announcementService;

    @PostMapping
    public ResponseEntity<Void> createAnnouncement(@RequestBody AnnouncementCreateRequest request) {
        announcementService.createAnnouncement(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnouncementResponse> getAnnouncementById(@PathVariable Long id) {
        AnnouncementResponse response = announcementService.getAnnouncementById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Page<AnnouncementResponse>> getAllAnnouncements(Pageable pageable) {
        Page<AnnouncementResponse> response = announcementService.getAllAnnouncements(pageable);
        return ResponseEntity.ok(response);
    }
}
