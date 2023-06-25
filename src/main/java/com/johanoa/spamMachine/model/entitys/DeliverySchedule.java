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
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name="Start Time")
    private LocalTime startTime;
    @Column(name="End Time")
    private LocalTime endTime;
    @Column(name="Days Of Week")
    private DaysOfWeek daysOfWeek;

}
