package com.acme.center.platform.learning.domain.model.aggregate;

import com.acme.center.platform.learning.domain.model.valueobjects.LearningPath;
import com.acme.center.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.apache.logging.log4j.util.Strings;

@Getter
@Entity
public class Course extends AuditableAbstractAggregateRoot<Course> {

    private String title;
    private String description;

    @Embedded
    private final LearningPath learningPath;

    public Course() {
        this.title = Strings.EMPTY;
        this.description = Strings.EMPTY;
        this.learningPath = new LearningPath();
    }

    public Course updateInformation(String title, String description) {
        this.title = title;
        this.description = description;
        return this;
    }

}
