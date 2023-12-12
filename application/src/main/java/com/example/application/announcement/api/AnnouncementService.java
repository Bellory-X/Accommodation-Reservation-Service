package com.example.application.announcement.api;

import com.example.application.announcement.api.crud.AnnouncementForm;
import com.example.application.announcement.api.guide.AnnouncementGuideRow;

import java.util.List;

public interface AnnouncementService {

    void createAnnouncement(AnnouncementForm announcementForm);

    void updateAnnouncement(AnnouncementForm announcementForm);

    void deleteAnnouncement(Long id);

    AnnouncementForm getAnnouncementFormById(Long id);

    List<AnnouncementGuideRow> getAnnouncementGuideRows();
}
