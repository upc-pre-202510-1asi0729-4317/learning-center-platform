package com.acme.center.platform.learning.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record Tutoriald(Long tutorialId) {
    public Tutoriald {
        if (tutorialId == null || tutorialId <= 0)
            throw new IllegalArgumentException("Tutorial id cannot be null or less than 0 or equal to 0");
    }
}
