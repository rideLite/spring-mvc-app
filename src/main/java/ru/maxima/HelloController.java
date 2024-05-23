package ru.maxima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-user")
    public String sayHello(){
        return "page";
    }
}
