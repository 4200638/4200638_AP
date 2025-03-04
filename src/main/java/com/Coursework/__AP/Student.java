package com.Coursework.__AP;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private double grade;
    private boolean igCode;
    private double hfValue;

    // Default constructor
    public Student() {}

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getGrade() { return grade; }
    public boolean isIgCode() { return igCode; }
    public double getHfValue() { return hfValue; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setGrade(double grade) { this.grade = grade; }
    public void setIgCode(boolean igCode) { this.igCode = igCode; }
    public void setHfValue(double hfValue) { this.hfValue = hfValue; }
}