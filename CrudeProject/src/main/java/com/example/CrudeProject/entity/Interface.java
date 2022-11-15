package com.example.CrudeProject.entity;

import javax.persistence.*;

@Table(name = "INTERFACE")
@Entity
public class Interface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name="Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "steps_id")
    private Steps steps;

    public Interface(Steps steps) {
        this.steps = steps;
    }

    public Steps getSteps() {
        return steps;
    }

    public void setSteps(Steps steps) {
        this.steps = steps;
    }

    public Interface() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Interface(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
