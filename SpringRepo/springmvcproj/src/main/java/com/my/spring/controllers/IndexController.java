package com.my.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
 

/**
 * Created by karthik on 8/5/2018.
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model m) {
        System.out.println("I cam here");
        m.addAttribute("someAttribute", "This is Karthik");
        return "index";
    }
}