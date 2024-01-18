package com.example.sem3Exampl1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControllers {

    @RequestMapping("/home")
    public String home()
    {
        return "home.html";
    }

}
