package com.springbooitproject.library.librarymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private int bookId;
    private String bookName;
    private  String message;
    private boolean isActive;
}
