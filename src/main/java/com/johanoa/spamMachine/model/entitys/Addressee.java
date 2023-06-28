package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Represents an addressee entity in the system.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Addressee implements Serializable {
    /**
     * The unique identifier of the addressee.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    private int id;

    /**
     * The name of the addressee.
     */
    @Column(name = "Name", nullable = false, length = 20)
    private String name;

    /**
     * The last name of the addressee.
     */
    @Column(name = "Lastname", nullable = false, length = 10)
    private String lastname;

    /**
     * The email of the addressee.
     */
    @Column(name = "Email", nullable = false, length = 50, unique = true)
    private String email;
}
