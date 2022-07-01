package com.example.DockerKube.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/print")
    public String print(){
        return "Hello world";
    }
}
