package com.acme.center.platform.learning.domain.model.event;

import com.acme.center.platform.learning.domain.model.valueobjects.Tutoriald;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class TutorialCompletedEvent extends ApplicationEvent {

    private final Long enrollmentId;
    private final Tutoriald tutoriald;

    public TutorialCompletedEvent(Object source, Long enrollmentId, Tutoriald tutoriald) {
        super(source);
        this.enrollmentId = enrollmentId;
        this.tutoriald = tutoriald;
    }

}
