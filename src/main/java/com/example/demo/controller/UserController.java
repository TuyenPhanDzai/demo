package com.example.demo.controller;

import com.example.demo.module.User;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public User getUserInfo() {
        return User.builder()
                .id("123")
                .name("tuyen")
                .build();
    }

}
