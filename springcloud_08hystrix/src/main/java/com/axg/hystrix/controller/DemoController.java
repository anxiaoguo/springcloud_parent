package com.axg.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/demo")
    @HystrixCommand(fallbackMethod = "demoFallBack")  //熔断之后的处理
    public String demo(@RequestParam("id") Integer id) {
        System.out.println("demo ok !!!");
        if (id < 0) {
            throw new RuntimeException("服务器开小差了....");
        }
        return "demo ok !!!";
    }


    public String demoFallBack(Integer id){
        return "当前活动太火爆,服务不可用....";
    }


}
