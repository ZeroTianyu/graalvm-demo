package com.open.graalvm.controller;

import com.open.graalvm.feign.ProductpageClient;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author guotianyu
 * @since 2024/6/13 11:28
 */
@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private ProductpageClient productpageClient;


    @GetMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://productpage/productpage", String.class);
    }

    @GetMapping("/pagetest")
    public String pagetest() {
        return productpageClient.productpage();
    }


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
