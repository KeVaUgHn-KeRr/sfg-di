package com.springframework.sfgdi.services;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Primary Bean";
    }
}
