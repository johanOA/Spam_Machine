package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
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
    /**
     * The unique identifier of the sent history message.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    private int id;

    /**
     * The date when the message was sent.
     */
    @Column(name = "Sent Date", nullable = false)
    private LocalDate sentDate;

    /**
     * The time when the message was sent.
     */
    @Column(name = "Sent Time", nullable = false)
    private LocalTime sentTime;
}
