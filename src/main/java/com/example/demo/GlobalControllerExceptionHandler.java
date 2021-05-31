package com.example.demo;

import com.example.demo.model.Error400;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(ResponseException.class)
    public ResponseEntity<Error400> handleResponseException(ResponseException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.toError400());
    }

}
