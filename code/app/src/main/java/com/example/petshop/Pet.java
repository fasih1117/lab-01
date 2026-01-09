package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    // Constructor: name oonly and birthDate defaults to now
    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    // Constructor: name + birthDate
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getters / Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Abstract method
    public abstract String speak();
}
