package com.practo.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String disease;
    private String age;

    // Constructors, getters, and setters (if not already present) should be included here

    // Default constructor
    public Patient() {
    }

    // Parameterized constructor
    public Patient(String name, String disease, String age) {
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    // Getters and Setters
    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

