package com.example.application.announcement.api.crud;

public record AnnouncementForm(
        Long id,
        String title,
        String address,
        Integer price,
        Integer numberOfBeds,
        String description
) {
}
