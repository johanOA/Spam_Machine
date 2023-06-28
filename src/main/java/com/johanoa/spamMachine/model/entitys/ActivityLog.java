package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Represents an activity log entry in the system.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ActivityLog implements Serializable {
    /**
     * The unique identifier of the activity log entry.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    /**
     * The type of activity being logged.
     */
    @Column(name = "activity_type", nullable = false)
    private  ActivityType activityType;
    /**
     * The date and time when the activity occurred.
     */
    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;
    /**
     * A description of the activity.
     */
    @Column(name = "description", nullable = false)
    private String description;
}
