package com.codeup.springblog.models;

import javax.persistence.*;

public class ChewToy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private boolean isDestroyed;

    @ManyToMany
    @JoinColumn(name = "pet_id")
    private Pet pet;
}

