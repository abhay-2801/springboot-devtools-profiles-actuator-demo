package com.example.springboot_devtools_profiles_actuator.controller;


import com.example.springboot_devtools_profiles_actuator.config.GreetingConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingConfig greetingConfig;

    public GreetingController(GreetingConfig config, GreetingConfig greetingConfig) {
        this.greetingConfig = greetingConfig;
    }

    @GetMapping("/greeting")
    public String greet() {
        return greetingConfig.getMessage();
    }
}
