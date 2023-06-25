package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Time;
import java.time.LocalTime;

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
    private LocalTime startTime;
    private LocalTime endTime;
    private DaysOfWeek daysOfWeek;

}
