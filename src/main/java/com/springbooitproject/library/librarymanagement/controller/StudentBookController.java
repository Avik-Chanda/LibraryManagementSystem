package com.springbooitproject.library.librarymanagement.controller;

import com.springbooitproject.library.librarymanagement.dto.AssignRequest;
import com.springbooitproject.library.librarymanagement.entity.StudentBook;
import com.springbooitproject.library.librarymanagement.repository.StudentBookRepository;
import com.springbooitproject.library.librarymanagement.services.StudentBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentBookController {

    @Autowired
    private StudentBookServices sbServices;

    @PostMapping("/assignBooksToStudents")
    public List<StudentBook> assignBooksToStudent(@RequestBody List<AssignRequest> request)
    {
        return sbServices.saveProducts(request);
    }
}
