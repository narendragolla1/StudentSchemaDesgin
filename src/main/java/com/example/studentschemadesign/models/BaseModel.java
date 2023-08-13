package com.example.studentschemadesign.models;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import java.util.Date;

// common thing we keep here
// isCreated, isDeleted,lastModifiedAt
@MappedSuperclass // tell spring boot that this extends by child class
public class BaseModel {
    @Id // spring does know that this is ID
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date lastModifiedAt;

}

// how is id is going to generate?
// when object is stored in table.
// logic of generation of id -> AutoIncrement is not recommended(not good for security/ it can be hacked).
// We use UUID (this is recommended for security)


