package com.petov.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //commit for master branch

    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "Hello travis";
    }
}
