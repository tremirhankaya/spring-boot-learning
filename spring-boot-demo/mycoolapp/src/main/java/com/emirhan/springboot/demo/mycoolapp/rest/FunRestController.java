package com.emirhan.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    @GetMapping("/hello2") // "/hello2" yolunu dinler
    public String sayHello2() {
        return "Hello World 2!";
    }

}
