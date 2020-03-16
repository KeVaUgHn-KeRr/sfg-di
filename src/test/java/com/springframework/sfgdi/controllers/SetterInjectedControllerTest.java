package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setGreetingService(new PropertyInjectedGreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }

    @Test
    void greetingService() {
    }
}