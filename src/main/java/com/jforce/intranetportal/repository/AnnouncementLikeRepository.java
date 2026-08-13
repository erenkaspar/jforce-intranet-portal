package com.jforce.intranetportal.repository;

import com.jforce.intranetportal.entity.AnnouncementLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementLikeRepository extends JpaRepository<AnnouncementLike, Long> {

    // Kullanıcı bu duyuruyu daha önce beğenmiş mi diye kontrol eder
    boolean existsByAnnouncementIdAndLikerId(Long announcementId, Long likerId);

    // Beğeniyi geri çekmek (Unlike) için kullanılır
    void deleteByAnnouncementIdAndLikerId(Long announcementId, Long likerId);
}
