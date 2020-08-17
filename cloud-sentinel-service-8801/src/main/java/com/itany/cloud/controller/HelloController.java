package com.itany.cloud.controller;

import com.itany.cloud.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @RequestMapping("/f1")
    public ResponseResult f1() {
        return ResponseResult.success();
    }

}
