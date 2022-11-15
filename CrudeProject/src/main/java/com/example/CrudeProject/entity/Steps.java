package com.example.CrudeProject.entity;

import org.springframework.http.HttpStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "steps")
@Entity
public class Steps {
    @Id
    @GeneratedValue
    @Column(name="Id")
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="index")
    private Long index;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(
            mappedBy = "steps",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Interface> inters=new ArrayList<>();

    public Steps() {
    }

    public Steps(List<Interface> inters) {
        this.inters = inters;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Steps(String step_updated, HttpStatus ok) {
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

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Steps(int id, String name, Long index) {
        this.id = id;
        this.name = name;
        this.index = index;
    }
}
