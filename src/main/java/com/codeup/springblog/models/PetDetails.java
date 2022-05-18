package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_details")
public class PetDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String personalityDescription;

    private boolean isSterile;

    private int weightInOunces;
}
