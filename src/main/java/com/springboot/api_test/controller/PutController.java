package com.springboot.api_test.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/s2/v1")
public class PutController {
    @PutMapping(value = "/put/member")
    public String put1(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.forEach((key, value) -> {
            sb.append("Key: ").append(key).append(", Value: ").append(value).append("\n");
        });

        return sb.toString();
    }
}

