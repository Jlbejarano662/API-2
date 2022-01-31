package com.jlbejarano.quileia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CITY")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
public class City {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="NUMBER_INHABITANTS")
    private int numberInhabitants;

    @Column(name="TOURIST_SITE")
    private String  touristSite;

    @Column(name="POPULAR_HOTEL")
    private String popularHotel;

}
