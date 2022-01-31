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
@Table(name="BOOKING")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString 
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name="ID")
    private Long id;

    @Column(name="ID_CITY") 
    private Long idCity;

    @Column(name="ID_TOURIST")
    private Long idTourist;

    @Column(name="TRAVEL_BUDGET")
    private double travelBudget;

    @Column(name="CARD_PAYMENT")
    private boolean cardPayment;

    @Column(name="DATE_BOOKING")
    private String date;

}
