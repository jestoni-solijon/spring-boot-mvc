package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller annotation marks this class as a Spring MVC Controller
// Controllers handle HTTP requests and return responses
@Controller
public class HomeController {

    // @GetMapping("/") maps HTTP GET requests to "/" to this method
    // This handles requests to the root URL (homepage)
    @GetMapping("/")
    // Model parameter allows us to pass data to the view template
    public String home(Model model) {
        // Add an attribute named "message" to the model
        // This will be accessible in the Thymeleaf template
        model.addAttribute("message", "Welcome to Spring Boot!");

        // Return the view name "home" which maps to home.html
        // Spring will look for this template in src/main/resources/templates/
        return "home";
    }
}