package com.example.demoRelations.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;

    public Faculty(){

    }
    public Faculty(String name){
        this.name=name;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
