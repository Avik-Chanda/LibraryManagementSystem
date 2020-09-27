package com.springbooitproject.library.librarymanagement.repository;

import com.springbooitproject.library.librarymanagement.entity.StudentBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentBookRepository  extends JpaRepository<StudentBook , Integer> {

    //Find if the book_id exists in the student StudentBook Table
    List<StudentBook> findByBook_id(int book_id);
}
