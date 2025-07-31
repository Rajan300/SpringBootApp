package com.example.springbootapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Setter
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(nullable = false,name = "name")
    private String name;
    @Column(nullable = false,name = "email")
    private String email;
    @Column(nullable = false,name = "password")
    private String password;

    @OneToMany
    private List<Address> addresses= new ArrayList<>();



}
