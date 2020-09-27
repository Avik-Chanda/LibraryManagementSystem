package com.springbooitproject.library.librarymanagement.repository;

import com.springbooitproject.library.librarymanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {
}
