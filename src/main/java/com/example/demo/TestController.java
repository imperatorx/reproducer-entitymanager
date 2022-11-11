package com.example.demo;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TestController {

    @Autowired
    private EntityManager entityManager;

    public String foo() {
        return "lol";
    }

}
