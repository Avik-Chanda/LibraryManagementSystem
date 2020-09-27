package com.springbooitproject.library.librarymanagement.repository;

import com.springbooitproject.library.librarymanagement.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {
}
