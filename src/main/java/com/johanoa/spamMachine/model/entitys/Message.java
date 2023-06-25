package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private int id;
    private String content;
    private LocalDate scheduledDate;
    private LocalTime sheduledTime;
}
