package com.springboot.api_test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/s2/v1")
public class DeleteController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {

        System.out.println(userId);
        System.out.println(account);
    }
}
