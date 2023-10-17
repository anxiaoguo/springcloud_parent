package com.axg.category.controller;

import com.axg.category.feign.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CategoryController {


    @Resource
    private ProductClient productClient;

    @GetMapping("/category")
    public String category(){

        String product = productClient.product();

        return "请求成功category,返回值："+product;
    }


}
