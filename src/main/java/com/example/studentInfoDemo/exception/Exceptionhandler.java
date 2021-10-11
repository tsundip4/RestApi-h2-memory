package com.example.studentInfoDemo.exception;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.http.HttpResponse;

@ControllerAdvice
public class Exceptionhandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public final ResponseEntity<ExceptionMessage> StudentNotFound(StudentNotFoundException ex){

        ExceptionMessage exceptionMessage = new ExceptionMessage(ex.getMessage(), 404, "search in ourStudentDb.com");
        return new ResponseEntity(exceptionMessage, HttpStatus.BAD_REQUEST);
    }

}
