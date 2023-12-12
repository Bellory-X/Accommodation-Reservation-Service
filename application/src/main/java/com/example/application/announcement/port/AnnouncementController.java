package com.example.application.announcement.port;

import com.example.application.announcement.api.AnnouncementService;
import com.example.application.announcement.api.crud.AnnouncementForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnnouncementController {

    private final AnnouncementService service;

    public AnnouncementController(AnnouncementService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getAnnouncementGuideRows(Model model) {
        model.addAttribute("announcements", service.getAnnouncementGuideRows());
        return "announcements";
    }

    @GetMapping("/form")
    public String getNewAnnouncementForm(Model model) {
        return "announcement-create";
    }

    @GetMapping("/form/{id}")
    public String getAnnouncementFormById(@PathVariable Long id, Model model) {
        model.addAttribute("announcement", service.getAnnouncementFormById(id));
        return "announcement-form";
    }

    @PostMapping("/form-create")
    public String createAnnouncement(AnnouncementForm announcementForm) {
        service.createAnnouncement(announcementForm);
        return "redirect:/";
    }

    @PostMapping("/form-delete/{id}")
    public String deleteAnnouncement(@PathVariable Long id) {
        service.deleteAnnouncement(id);
        return "redirect:/";
    }

}
