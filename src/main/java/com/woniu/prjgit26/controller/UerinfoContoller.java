package com.woniu.prjgit26.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UerinfoContoller {
    @GetMapping("/say")
    public String say(){
        System.out.println(1);
        return "hello";
    }

    public void dev1(){

    }

    public void drink(){
        System.out.println("drink beer");
    }

    @GetMapping("/say1")
    public String say1(){
        return "hello";
    }
}
