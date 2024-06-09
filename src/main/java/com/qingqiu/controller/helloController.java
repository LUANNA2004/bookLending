package com.qingqiu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/10 4:53
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class helloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
