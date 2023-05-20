package com.example.Swagger.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class PruebaController {

    @GetMapping
    public String getAll(){
        return "all";
    }

    @PostMapping
    public String create(@RequestBody String test){
        return test;
    }
}
