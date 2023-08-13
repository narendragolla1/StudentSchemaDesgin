package com.example.studentschemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel {
    @ManyToOne
    private Student student;
    @ManyToOne
    private ModuleExam moduleExam;
    private int marks;


}
// SME:S =(1:1)+(M:1)=(M:1)
//SME: ME= (1:1)+(M:1)=(M:1)

