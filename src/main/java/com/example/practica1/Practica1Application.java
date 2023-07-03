package com.example.practica1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Practica1Application {

    @GetMapping("/mensaje")
        public String mensaje(){
        return "welcome fron java to azure";
        }
    public static void main(String[] args) {
        SpringApplication.run(Practica1Application.class, args);
    }

}
