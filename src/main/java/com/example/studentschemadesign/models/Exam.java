package com.example.studentschemadesign.models;

import jakarta.persistence.Entity;

@Entity
public class Exam extends BaseModel {
    private int duration;
    private String name;

}
