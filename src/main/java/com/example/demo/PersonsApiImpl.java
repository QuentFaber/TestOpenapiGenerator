package com.example.demo;

import com.example.demo.api.PersonsApiDelegate;
import com.example.demo.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonsApiImpl implements PersonsApiDelegate {

    @Override
    public ResponseEntity<List<Person>> personsGet(Integer age) {
        if (age == null) {
            throw new PersonNotFoundException();
        }

        Person p = new Person();
        p.firstname("Jean Yves");
        p.lastname("Dupont");
        p.username("JYD");
        p.age(age);

        return ResponseEntity.ok(List.of(p));
    }

    @Override
    public ResponseEntity<Person> personsUsernameGet(String username) {
        if (username == null) {
            throw new PersonNotFoundException();
        }

        Person p = new Person();
        p.firstname("Jean Yves");
        p.lastname("Dupont");
        p.username(username);
        p.age(42);

        return ResponseEntity.ok(p);
    }

}
