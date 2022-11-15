package com.example.CrudeProject.entity;



import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "USER")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="AspirationSlo")
    private Long aspirationalSlo;
    @Column(name="TargetSlo")
    private Long targetSlo;
   @OneToMany(
           mappedBy = "user",
           cascade = CascadeType.ALL,
           orphanRemoval = true
   )
    private List<Steps> steps=new ArrayList<>();

    public User(int id, String name, Long aspirationalSlo, Long targetSlo, List<Steps> steps) {
        this.id = id;
        this.name = name;
        this.aspirationalSlo = aspirationalSlo;
        this.targetSlo = targetSlo;
        this.steps = steps;
    }

    public User() {
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

    public Long getAspirationalSlo() {
        return aspirationalSlo;
    }

    public void setAspirationalSlo(Long aspirationalSlo) {
        this.aspirationalSlo = aspirationalSlo;
    }

    public Long getTargetSlo() {
        return targetSlo;
    }

    public void setTargetSlo(Long targetSlo) {
        this.targetSlo = targetSlo;
    }


}
