package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeliveryConfiguration {
    @Id
    @EqualsAndHashCode.Include
    private int id;
    private String allowedCategories;
}
