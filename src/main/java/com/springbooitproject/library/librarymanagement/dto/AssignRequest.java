package com.springbooitproject.library.librarymanagement.dto;

import com.springbooitproject.library.librarymanagement.entity.Books;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignRequest {

    private int student_id;
    private Set<Integer> book_id;
}
