package com.jforce.intranetportal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "likes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"announcement_id", "liker_id"})
})
@NamedEntityGraph(
        name = "AnnouncementLike.withAnnouncementAndLiker",
        attributeNodes = {
                @NamedAttributeNode("announcement"),
                @NamedAttributeNode("liker")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnnouncementLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "announcement_id", nullable = false)
    private Announcement announcement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "liker_id", nullable = false)
    private Employee liker;
}
