package com.springboot.api_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s2/v1")
public class GetController {

    @GetMapping("get/name")
    public String getName(){
        return "김진영";
    }
}
