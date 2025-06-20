package com.acme.center.platform.learning.application.internal.eventhandlers;

import com.acme.center.platform.learning.domain.model.events.TutorialCompletedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class TutorialCompletedEventHandler {


    @EventListener(TutorialCompletedEvent.class)
    public void on(TutorialCompletedEvent event) {
        var tutorialId = event.getTutorialId();
    }


}
