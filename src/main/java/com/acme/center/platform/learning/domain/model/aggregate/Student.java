package com.acme.center.platform.learning.domain.model.aggregate;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import com.acme.center.platform.learning.domain.model.valueobjects.ProfileId;
import com.acme.center.platform.learning.domain.model.valueobjects.StudentPerformanceMetricSet;
import com.acme.center.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Student extends AuditableAbstractAggregateRoot<Student> {

    @Embedded
    @Column(name = "acme_student_id")
    private AcmeStudentRecordId acmeStudentRecordId;

    @Embedded
    private ProfileId profileId;

    @Embedded
    private StudentPerformanceMetricSet performanceMetricSet;

    public Student() {
        super();
        this.acmeStudentRecordId = new AcmeStudentRecordId();
        this.performanceMetricSet = new StudentPerformanceMetricSet();
    }

    public Student(Long profileId) {
        this();
        this.profileId = new ProfileId(profileId);
    }

    public Student(ProfileId profileId) {
        this();
        this.profileId = profileId;
    }

}
