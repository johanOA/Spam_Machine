package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Message implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name="Content")
    private String content;
    @Column(name="Scheduled Date")
    private LocalDate scheduledDate;
    @Column(name="Scheduled Time")
    private LocalTime sheduledTime;
}
