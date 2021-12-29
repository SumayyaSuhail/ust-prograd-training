package com.jexample.jpademo.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String batch;
    private Double marks;
    @Column(nullable = false)
    private Integer age;
    @Column(name = "phonenumber", nullable = false, unique = true, updatable = false)
    private String phoneNumber;
    public Student(){

    }
    public Student(String name, String batch, Double marks, Integer age, String phoneNumber){
        this.name=name;
        this.batch=batch;
        this.marks=marks;
        this.age=age;
        this.phoneNumber=phoneNumber;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}