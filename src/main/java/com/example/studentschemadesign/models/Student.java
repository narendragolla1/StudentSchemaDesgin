package com.example.studentschemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Student  extends BaseModel{

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;
    @ManyToMany // S:M=(1:M)+(M:1)=(M:M)
//    this is @ManyToMany so we have to mapping table for this
//    spring boot internally create for us mapping table
    private List<Module> enrolledModules;


}
