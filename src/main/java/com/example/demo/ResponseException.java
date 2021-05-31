package com.example.demo;

import com.example.demo.model.Error400;

public class ResponseException extends RuntimeException {
    private String message;

    public ResponseException(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Error400 toError400() {
        return new Error400().message(message);
    }

}
