package com.acme.center.platform.learning.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record AcmeStudentRecordId (String studentRecordId) {

    public AcmeStudentRecordId() {
        this(UUID.randomUUID().toString());
    }

}