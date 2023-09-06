package com.alexmenov.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "users_mvc", catalog = "users")
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private final Integer id;

    @Column
    private final String name;

    @Column(name = "last_name")
    private final String lastName;

    @Column
    private final String department;

    @Column
    private final Integer salary;
}
