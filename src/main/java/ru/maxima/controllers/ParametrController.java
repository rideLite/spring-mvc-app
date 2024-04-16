package ru.maxima.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("test")
public class ParametrController {

    @GetMapping("/hello")
    public String getParametr(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");

        model.addAttribute("message", "Hello "+ name+ " " + " lastname " + lastname+ "! =)");


        System.out.println("Hello "+ name+ " " + " lastname " + lastname+ "! =)");
        return "second/hello-user.html";
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam(value = "country", required = false) String country,
                             @RequestParam(value = "city",required = false) String city){



        System.out.println("country - "+ country + "|| city - " + city );


        return "second/map.html";
    }
}
