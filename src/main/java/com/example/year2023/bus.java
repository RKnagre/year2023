package com.example.year2023;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/mybus")
    public String getData(){
        return " Please book ticket here,SAMARK EXPRESS";
        
    }
}
