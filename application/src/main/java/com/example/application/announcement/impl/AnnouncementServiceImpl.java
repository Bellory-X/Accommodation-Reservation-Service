package com.example.application.announcement.impl;

import com.example.application.announcement.api.AnnouncementService;
import com.example.application.announcement.api.crud.AnnouncementForm;
import com.example.application.announcement.api.guide.AnnouncementGuideRow;
import com.example.application.announcement.impl.model.Announcement;
import com.example.application.announcement.impl.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService {

    private final AnnouncementRepository repository;

    public AnnouncementServiceImpl(AnnouncementRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createAnnouncement(AnnouncementForm announcementForm) {
        var announcement = map(announcementForm);
        repository.save(announcement);
    }

    @Override
    public void updateAnnouncement(AnnouncementForm announcementForm) {
        var announcement = repository.findById(announcementForm.id()).orElseThrow();
        repository.save(map(announcementForm, announcement));
    }

    @Override
    public void deleteAnnouncement(Long id) {
        repository.findById(id).ifPresent(repository::delete);
    }

    @Override
    public AnnouncementForm getAnnouncementFormById(Long id) {
        var dbModel = repository.findById(id).orElseThrow();
        return map(dbModel);
    }

    @Override
    public List<AnnouncementGuideRow> getAnnouncementGuideRows() {
        return repository.findAll().stream().map(this::mapToRow).toList();
    }

    private AnnouncementGuideRow mapToRow(Announcement dbModel) {
        return new AnnouncementGuideRow(
                dbModel.getId(),
                dbModel.getTitle(),
                dbModel.getAddress(),
                dbModel.getPrice()
        );
    }

    private AnnouncementForm map(Announcement dbModel) {
        return new AnnouncementForm(
                dbModel.getId(),
                dbModel.getTitle(),
                dbModel.getAddress(),
                dbModel.getPrice(),
                dbModel.getNumberOfBeds(),
                dbModel.getDescription()
        );
    }

    private Announcement map(AnnouncementForm dtoModel) {
        var dbModel = new Announcement();
        return map(dtoModel, dbModel);
    }

    private Announcement map(AnnouncementForm dtoModel, Announcement dbModel) {
        dbModel.setId(dtoModel.id());
        dbModel.setTitle(dtoModel.title());
        dbModel.setAddress(dtoModel.address());
        dbModel.setPrice(dtoModel.price());
        dbModel.setNumberOfBeds(dtoModel.numberOfBeds());
        dbModel.setDescription(dtoModel.description());

        return dbModel;
    }
}
