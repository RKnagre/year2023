package com.example.year2023;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/myvisa")
    public String getData(){
        return "Please book the visa to return ";
    }
}
