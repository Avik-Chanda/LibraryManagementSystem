package com.springbooitproject.library.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_book")
public class StudentBook {

    @Id
    @GeneratedValue
    private int id;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="book_id" , referencedColumnName = "student_id")
    private Books book;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="student_id" , referencedColumnName = "book_id")
    private Student students;
}
