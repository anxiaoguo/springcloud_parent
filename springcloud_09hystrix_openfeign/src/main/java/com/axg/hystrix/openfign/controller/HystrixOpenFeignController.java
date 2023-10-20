package com.axg.hystrix.openfign.controller;

import com.axg.hystrix.openfign.feign.HystrixClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystrixOpenFeignController {



    @Resource
    private HystrixClient hystrixClient;

    @GetMapping("/openFeign")
    public String openFeign(){

        String demo = hystrixClient.demo(-1);

        return "ok,返回值："+demo;
    }



}
