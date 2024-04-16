package ru.maxima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class HelloController {

    @GetMapping("/hello-user")
    public String sayHello(){
        return "first/page1";
    }



}
