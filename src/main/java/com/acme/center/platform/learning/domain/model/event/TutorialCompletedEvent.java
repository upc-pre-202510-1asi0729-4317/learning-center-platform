package com.acme.center.platform.learning.domain.model.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class TutorialCompletedEvent extends ApplicationEvent {

    private String tutorialId;
    public TutorialCompletedEvent(Object source, String tutorialId) {
        super(source);
        this.tutorialId = tutorialId;
    }

}
