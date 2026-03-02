package com.example.project_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project_login.response.ApiResponse;

@RestController
@RequestMapping("/api")
public class HolaController {
    
    @GetMapping("/hola")
    public ApiResponse hola() {
        return new ApiResponse("Hola Mundo");
    }
}
