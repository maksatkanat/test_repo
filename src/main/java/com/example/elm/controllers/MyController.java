package com.example.elm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getMain(Model model){
        return "index";
    }

    @GetMapping("/about_us")
    public String getAboutUs(Model model){
        return "about_us";
    }

    @GetMapping("/services")
    public String getServices(Model model){
        return "services";
    }

    @GetMapping("/portfolio")
    public String getPortfolio(Model model){
        return "portfolio";
    }

    @GetMapping("/contacts")
    public String getContacts(Model model){
        return "contacts";
    }
}
