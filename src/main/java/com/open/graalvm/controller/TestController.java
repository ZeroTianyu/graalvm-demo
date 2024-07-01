package com.open.graalvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guotianyu
 * @since 2024/6/13 11:28
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("hello world!!!");
        return "hello";
    }


    @GetMapping("/hello2")
    public String helloWorld2() {
        return "hello2";
    }
}
