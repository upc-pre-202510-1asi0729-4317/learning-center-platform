package com.acme.center.platform.learning.domain.model.aggregate;

import com.acme.center.platform.learning.domain.model.event.TutorialCompletedEvent;
import com.acme.center.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Entity;

@Entity
public class Enrollment extends AuditableAbstractAggregateRoot<Enrollment> {

    private String course;

    void tutorialCompleted() {
        this.registerEvent(new TutorialCompletedEvent(this, "T01"));
    }

}
