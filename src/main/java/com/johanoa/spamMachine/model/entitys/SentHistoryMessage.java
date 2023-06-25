package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SentHistoryMessage {
    @Id
    @EqualsAndHashCode.Include
    private int id;
    private LocalDate sentDate;
    private LocalTime sentTime;

}
