package com.axg.hystrix.product.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping("/list")
    public String orderList(){

        System.out.println("有请求过来order这里啦~~~");
        return "order 信息List";

    }

}
