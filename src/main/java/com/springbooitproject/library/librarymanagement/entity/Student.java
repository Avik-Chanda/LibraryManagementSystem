package com.springbooitproject.library.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_table")
public class Student {

    @Id
    @GeneratedValue
    private int student_id;
    private String student_name;
    private String student_address;
    private boolean isActive;
}
