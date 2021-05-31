package com.example.demo;

public class PersonNotFoundException extends ResponseException {

    public PersonNotFoundException() {
        super("No persons found");
    }

}
