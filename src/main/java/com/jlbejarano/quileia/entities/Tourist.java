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
@Table(name="TOURIST")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
public class Tourist {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name="ID")
    private Long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String  lastName;

    @Column(name="BIRTH_DATE")
    private String birthDate;

    @Column(name="ID_CARD_NUMBER")
    private int idCardNumber;

    @Column(name="IDENTITY_DOCUMENT")
    private String identityDocument;

    @Column(name="TRAVEL_FREQUENCY")
    private int travelFrequency;
    
}
