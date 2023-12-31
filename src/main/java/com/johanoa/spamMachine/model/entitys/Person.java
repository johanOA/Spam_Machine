package com.johanoa.spamMachine.model.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person implements Serializable {
    /**
     * The unique identifier of the person.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    private int id;

    /**
     * The name of the person.
     */
    @Column(name = "Name", nullable = false, length = 20)
    private String name;
    /**
     * The last name of the person.
     */
    @Column(name = "Lastname", nullable = false, length = 10)
    private String lastname;
    /**
     * The email of the person.
     */
    @Column(name = "Email", nullable = false, length = 50, unique = true)
    private String email;
}
