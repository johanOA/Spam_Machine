package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Time;
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeliverySchedule {
    @Id
    @EqualsAndHashCode.Include
    private int id;
    private Time startTime;
    private Time endTime;
    private DaysOfWeek daysOfWeek;

}
