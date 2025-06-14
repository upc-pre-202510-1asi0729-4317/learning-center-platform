package com.acme.center.platform.learning.domain.model.aggregate;

import com.acme.center.platform.learning.domain.model.event.TutorialCompletedEvent;
import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import com.acme.center.platform.learning.domain.model.valueobjects.EnrollmentStatus;
import com.acme.center.platform.learning.domain.model.valueobjects.ProgressRecord;
import com.acme.center.platform.learning.domain.model.valueobjects.Tutoriald;
import com.acme.center.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Enrollment extends AuditableAbstractAggregateRoot<Enrollment> {

    @Embedded
    private AcmeStudentRecordId acmeStudentRecordId;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Embedded
    private ProgressRecord progressRecord;

    private EnrollmentStatus status;

    public Enrollment() {

    }

    public Enrollment(AcmeStudentRecordId acmeStudentRecordId, Course course) {
        this.acmeStudentRecordId = acmeStudentRecordId;
        this.course = course;
        this.status = EnrollmentStatus.REQUESTED;
        this.progressRecord = new ProgressRecord();
    }

    public void completeTutorial(Tutoriald tutoriald) {
        //Publish event
        this.registerEvent(new TutorialCompletedEvent(this, this.getId(), tutoriald));
    }

}
