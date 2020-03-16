package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();

        controller.greetingService = new PropertyInjectedGreetingServiceImpl();
    }

    @Test
    void greetingService() {

        System.out.println(controller.greetingService());
    }
}