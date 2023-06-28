package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeliveryConfiguration {
    /**
     * The unique identifier of the delivery configuration.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private int id;
    /**
     * The allowed categories for message delivery.
     */
    @Column(name = "Allowed Categories", nullable = false)
    private Category allowedCategories;
}

