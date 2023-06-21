package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private int id;
    //It shall be the variable having the name of the characterised message type
    private  String activityTipe;
    private String description;
    private LocalDateTime dateTime;

}
