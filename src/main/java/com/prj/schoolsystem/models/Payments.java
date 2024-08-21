package com.prj.schoolsystem.models;

import jakarta.persistence.*;

@Entity
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String student;
    private String relationship;
    private String payment_method;
    private String type;
    private Double price;

    public String getPayment_method() {return payment_method;}

    public void setPayment_method(String payment_method) {this.payment_method = payment_method;}

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String employee) {
        this.relationship = relationship;
    }
}
