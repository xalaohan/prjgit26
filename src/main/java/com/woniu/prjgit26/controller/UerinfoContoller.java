package com.woniu.prjgit26.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UerinfoContoller {
    @GetMapping("/say")
    public String say(){
        return "hello";
    }

    @GetMapping("/say1")
    public String say1(){
        return "hello";
    }
}
