package com.example.lab12.Advise;

import com.example.lab12.Api.ApiException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class ControllerAdvise {
    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity ApiException(ApiException e){
        String message=e.getMessage();
        return ResponseEntity.status(400).body(message);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity MethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String msg = e.getFieldError().getDefaultMessage();
        return ResponseEntity.status(400).body(msg);
    }


    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity ConstraintViolationException(ConstraintViolationException e) {
        String msg =e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }



    @ExceptionHandler(value = SQLIntegrityConstraintViolationException.class)
    public ResponseEntity SQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException e){
        String msg=e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }


    @ExceptionHandler(value = InvalidDataAccessResourceUsageException.class )
    public ResponseEntity InvalidDataAccessResourceUsageException(InvalidDataAccessResourceUsageException e){
        String msg=e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }


    @ExceptionHandler(value = DataIntegrityViolationException.class)
    public ResponseEntity DataIntegrityViolationException(DataIntegrityViolationException e){
        String msg=e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }


    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ResponseEntity HttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        String msg = e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }


    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity HttpMessageNotReadableException(HttpMessageNotReadableException e) {
        String msg = e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }


    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    public ResponseEntity MethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        String msg = e.getMessage();
        return ResponseEntity.status(400).body(msg);
    }
}
