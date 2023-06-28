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
public class User implements Serializable {
    /**
     * The unique identifier of the user.
     */
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    private String id;
    /**
     * The username of the user.
     */
    @Column(name = "Username", nullable = false, length = 10)
    private String username;
    /**
     * The password of the user.
     */
    @Column(name = "Password", nullable = false, length = 15)
    private String password;
}
