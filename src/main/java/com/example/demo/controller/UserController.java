package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUserInfo() {
        return "Tuyen";
    }

}
