package com.example.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "districts")
public class District {
    @Id

    private int id;
    private String name;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "district", cascade = CascadeType.ALL)
//    private Set<Street> streets = new HashSet<Street>();

//    @OneToMany(mappedBy = "districts")
//    private Set<Street> streets;
}
