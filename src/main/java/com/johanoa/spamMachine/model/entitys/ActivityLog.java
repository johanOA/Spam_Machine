package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ActivityLog implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true, nullable = false)
    private int id;
    //It shall be the variable having the name of the characterised message type
    @Column(name="Activity Tipe")
    private  String activityTipe;
    @Column(name="Description")
    private String description;
    @Column(name="Date Time")
    private LocalDateTime dateTime;

}
