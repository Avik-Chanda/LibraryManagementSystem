package com.springbooitproject.library.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="book_table")
public class Books {

    @Id
    @GeneratedValue
    private int book_id;
    private String book_name;
    private String book_author;
    private boolean isActive;
}
