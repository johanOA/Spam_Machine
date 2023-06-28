package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalTime;
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeliverySchedule {
    /**
     * The unique identifier of the delivery schedule.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private int id;
    /**
     * The start time for message delivery.
     */
    @Column(name = "Start Time", nullable = false)
    private LocalTime startTime;
    /**
     * The end time for message delivery.
     */
    @Column(name = "End Time", nullable = false)
    private LocalTime endTime;
    /**
     * The days of the week for message delivery.
     */
    @Column(name = "Days Of Week", nullable = false)
    private DaysOfWeek daysOfWeek;
}
