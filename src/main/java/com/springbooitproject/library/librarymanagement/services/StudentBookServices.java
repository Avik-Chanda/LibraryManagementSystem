package com.springbooitproject.library.librarymanagement.services;

import com.springbooitproject.library.librarymanagement.dto.AssignRequest;
import com.springbooitproject.library.librarymanagement.entity.StudentBook;
import com.springbooitproject.library.librarymanagement.repository.BookRepository;
import com.springbooitproject.library.librarymanagement.repository.StudentBookRepository;
import com.springbooitproject.library.librarymanagement.repository.StudentRepository;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentBookServices {

    @Autowired
    private StudentBookRepository sbRepository;

    @Autowired
    private StudentRepository  studentRepository;

    @Autowired
    private BookRepository bookRepository;

    private List<StudentBook> studentBookList;

    public List<StudentBook> saveProducts(List<AssignRequest> request)
    {
        for(AssignRequest requestObject : request) {
            for (Integer bookId : requestObject.getBook_id()) {
                StudentBook studentBook = new StudentBook();
                studentBook.setBook(bookRepository.findById(bookId).orElse(null));
                studentBook.setStudents(studentRepository.findById(requestObject.getStudent_id()).orElse(null));
                studentBookList.add(studentBook);
            }
        }
        return sbRepository.saveAll(studentBookList);
    }

    public boolean isBookAssigned(int book_id)
    {
        List<StudentBook> isRecordeExists = sbRepository.findByBook_id(book_id);
        if(isRecordeExists.isEmpty())
        {
            return true;
        }

        return false;
    }
}
