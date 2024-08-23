package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "track")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Track {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;
    @Column(unique = true)
    String name;

    Integer totalHoures;
}
