package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_details")
public class PetDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String personalityDescription;

    private boolean isSterile;

    private int weightInOunces;

    public PetDetails() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getPersonalityDescription() {
        return personalityDescription;
    }

    public void setPersonalityDescription(String personalityDescription) {
        this.personalityDescription = personalityDescription;
    }

    public boolean isSterile() {
        return isSterile;
    }

    public void setSterile(boolean sterile) {
        isSterile = sterile;
    }

    public int getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(int weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    @Override
    public String toString() {
        return "PetDetails{" +
                "id=" + id +
                ", personalityDescription='" + personalityDescription + '\'' +
                ", isSterile=" + isSterile +
                ", weightInOunces=" + weightInOunces +
                '}';
    }
}
