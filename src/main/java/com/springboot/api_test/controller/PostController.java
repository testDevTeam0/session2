package com.springboot.api_test.controller;

import com.springboot.api_test.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s2/v1")
public class PostController {

    @PostMapping("/post/info")
    public PostRequestDto postInfo(@RequestBody PostRequestDto postRequestDto){

        return postRequestDto;
    }
}
