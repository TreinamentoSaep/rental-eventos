package com.senai.infoa.rental_eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
    
    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/principal")
    public String principal() {
        return "principal"; 
    }
}
