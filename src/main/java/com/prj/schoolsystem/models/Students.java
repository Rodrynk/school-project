package com.prj.schoolsystem.models;

import jakarta.persistence.*;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String student;
    private String parents;
    private String birth;
    private Double monthly_payment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Double getMonthly_payment() {
        return monthly_payment;
    }

    public void setMonthly_payment(Double monthly_payment) {
        this.monthly_payment = monthly_payment;
    }
}
