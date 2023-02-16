package com.example.DevOps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {

    @GetMapping("/get")
    public String getMessage(){
        return "Pushing to docker hub";
    }
}
