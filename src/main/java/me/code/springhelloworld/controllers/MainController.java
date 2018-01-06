package me.code.springhelloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping({"","/","hello"})
    public String homePage() {
        return "Hello World";
    }
}
