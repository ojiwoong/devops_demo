package com.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    private static final String template = "Heelo, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final String version = "2.0";

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "WORLD") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name), version);
    }
}
