package com.example.application.announcement.impl.repository;

import com.example.application.announcement.impl.model.Announcement;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long>, JpaSpecificationExecutor<Announcement> {
//    @Override
//    @EntityGraph("Announcement.all")
//    Page<Announcement> findAll(@Nullable Specification<Announcement> spec, @NonNull Pageable pageable);
}
