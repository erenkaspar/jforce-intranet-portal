package com.jforce.intranetportal.service;

import com.jforce.intranetportal.dto.request.AnnouncementCreateRequest;
import com.jforce.intranetportal.dto.response.AnnouncementResponse;
import com.jforce.intranetportal.entity.Announcement;
import com.jforce.intranetportal.repository.AnnouncementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnnouncementService {

    private final AnnouncementRepository announcementRepository;

    public void createAnnouncement(AnnouncementCreateRequest request) {
        Announcement announcement = new Announcement();
        announcement.setTitle(request.getTitle());
        announcement.setContent(request.getContent());
        //author vs. gelcek

        //depoya kaydetme işlemi
        announcementRepository.save(announcement);
    }

    //Tek kayıt getirme
    public AnnouncementResponse getAnnouncementById(Long id) {
        Announcement announcement = announcementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Announcement not found"));

        return mapToResponse(announcement);
    }

    //Pagerlı listeleme
    public Page<AnnouncementResponse> getAllAnnouncements(Pageable pageable) {
        return announcementRepository.findAll(pageable).map(this::mapToResponse);
    }

    private AnnouncementResponse mapToResponse(Announcement announcement) {
        return AnnouncementResponse.builder()
                .id(announcement.getId())
                .title(announcement.getTitle())
                .content(announcement.getContent())
                .createdAt(announcement.getCreatedAt())
                //author adı like sayısı vs. gelcek
                .build();
    }
}
