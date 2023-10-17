package com.axg.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/product")
    public String product(){

        System.out.println("执行product~~~~~");

        return "product ok";
    }


}
