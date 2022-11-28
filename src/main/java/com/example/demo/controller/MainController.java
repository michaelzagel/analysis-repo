package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

    @PostMapping("hello")
    public void testMethod(@RequestParam("name") String name) {
        System.out.println(name);
    }

    @GetMapping()
    public void getList(@RequestParam("name") String name) {

    }
}
