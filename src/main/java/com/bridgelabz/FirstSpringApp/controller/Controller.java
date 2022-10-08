package com.bridgelabz.FirstSpringApp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping(value = {"/", "/hello"})
    public String hello() {
        return "Hello from Bridgelabz";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello "+ name + " from Bridgelabz " ;
    }
}
