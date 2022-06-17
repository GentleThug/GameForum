package com.sea.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/he")
    public String PageToHello(){
        return "Hello";
    }

    @RequestMapping("/hv")
    public String PageToHelloVue(){
        return "HelloVue";
    }
}
