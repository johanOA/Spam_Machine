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
    /**
     * The unique identifier of the message.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    private int id;
    /**
     * The content of the message.
     */
    @Column(name = "Content", nullable = false, length = 3000)
    private String content;
    /**
     * The scheduled date for sending the message.
     */
    @Column(name = "Scheduled Date", nullable = false)
    private LocalDate scheduledDate;
    /**
     * The scheduled time for sending the message.
     */
    @Column(name = "Scheduled Time", nullable = false)
    private LocalTime scheduledTime;
}
