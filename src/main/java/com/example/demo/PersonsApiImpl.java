package com.example.demo;

import com.example.demo.api.PersonsApiDelegate;
import com.example.demo.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonsApiImpl implements PersonsApiDelegate {

    @Override
    public ResponseEntity<List<Person>> personsGet(Integer test) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
