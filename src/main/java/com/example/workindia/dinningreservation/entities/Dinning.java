package com.example.workindia.dinningreservation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "dinning_names")
public class Dinning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dinning_id")
    private Integer id;
    @Column(name = "dinning_name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phoneNo")
    private Long phoneNo;
    @Column(name = "open_time")
    private Date openTime;
    @Column(name = "closedTime")
    private Date closedTime;

    @ManyToMany
    private Set<User> slots = new HashSet<>();

}
