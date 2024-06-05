package com.example.planning.entity;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.List;

public class Planning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="calendriers")
    private List<Integer> calendrierId;

    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "calendrier", cascade = CascadeType.ALL, fetch =
            FetchType.EAGER)
    @ToString.Exclude
    private List<Calendrier> calendriers;


}
