package com.open.graalvm.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "productpage")
//会扫描指定包下，标记FeignClient注解的接口
//会根据服务名，从注册中心找到对应的IP地址
public interface ProductpageClient {
    //这里跟提供者接口的URL一致
    @RequestMapping("/productpage")
    String productpage();
}