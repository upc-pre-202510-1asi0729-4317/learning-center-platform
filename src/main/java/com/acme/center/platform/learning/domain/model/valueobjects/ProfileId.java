package com.acme.center.platform.learning.domain.model.valueobjects;

public record ProfileId(Long profileId) {

    public ProfileId() {
        this(0L);
    }

    public ProfileId {
        if (profileId == null || profileId < 1) {
            throw new IllegalArgumentException("Profile id cannot be null or less than 1.");
        }
    }
}
