package com.example.learndocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/test")
public class LearnDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnDockerApplication.class, args);
    }


    @GetMapping
    public String sayHi() {
        return "Assalomu alaykum";
    }

}
