package com.ceshi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloWord {

    @RequestMapping("/Hello")
    public String handle01(){
        return "hello, Spring Boot2!!!!!!!!!!!!!!!";
    }

}
