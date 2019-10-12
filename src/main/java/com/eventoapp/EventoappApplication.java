package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class EventoappApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventoappApplication.class, args);
    }

    @RequestMapping("/home")
    public String index() {
        return "index";
    }
}
