package com.ceshi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spring {

    @RequestMapping("/spring")
    public String spr1(){
        return "green  green  green";
    }
}
