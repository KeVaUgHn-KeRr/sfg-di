package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new PropertyInjectedGreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}