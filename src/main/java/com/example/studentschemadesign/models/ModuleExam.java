package com.example.studentschemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {
//    Many => ModuleExam( the class we are taking)
    @ManyToOne // ME:M=>(1 : 1 )+(M:1) = (M:1)
    private Module module;
    @ManyToOne //    ME:M =(1:1)+(M+1)
    private Exam exam;
    private Date dateOfExam;
}
// MODULE =>  we are taking about relationship btw two classes.
// must specify what is the cardinality of relation btw Moduleexam and module.
// so that spring boot can create table appropriately.

// cardinality btw
// ModuleExam : Module => M:1
// module_id, exam-id :
// 1 module with id 2 has exams with id(4,5,6)
// we will have moduleexam objects like
