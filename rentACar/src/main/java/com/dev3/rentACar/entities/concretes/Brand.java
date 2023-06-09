package com.dev3.rentACar.entities.concretes;

import jakarta.persistence.*;

import lombok.*;


@Table(name = "brands")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

}
