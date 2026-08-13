package com.jforce.intranetportal.repository;

import com.jforce.intranetportal.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    // Bir duyuruya ait tüm yorumları getirmek için özel metod
    List<Comment> findByAnnouncementIdOrderByCreatedAtDesc(Long announcementId);
}
