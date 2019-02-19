package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/startingOff")
    public String startingOffPage(){
        return "startingOff";
    }

    @RequestMapping("/levelingUp")
    public String levelingUpPage(){
        return "levelingUp";
    }


    @RequestMapping("/conqueringFoes")
    public String conqueringFoesPage(){
        return "conqueringFoes";
    }

    @RequestMapping("/defendingThrone")
    public String defendingThronePage(){
        return "defendingThrone";
    }

    @RequestMapping("/signUp")
    public String signUp(){
        return "signUp";
    }
}
