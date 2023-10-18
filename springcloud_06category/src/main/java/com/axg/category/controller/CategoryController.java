package com.axg.category.controller;

import com.axg.category.dto.CollectionDaraDTO;
import com.axg.category.entity.Product;
import com.axg.category.feign.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
public class CategoryController {


    @Resource
    private ProductClient productClient;

    @GetMapping("/category")
    public String category(){

//        String product = productClient.product();

//        String s = productClient.productOne(12L);

//        String s = productClient.productTwo(12L, "JACK");

//        String s = productClient.productUrl(12L, "JACK");

//        String s = productClient.productObject(new Product(12L, "电脑", new BigDecimal("5600"), new Date()));

//        String s = productClient.productArgs(new String[]{"2", "13", "18", "62"});

        CollectionDaraDTO dto = new CollectionDaraDTO();
        dto.setList(Arrays.asList("13","1312"));
        dto.setProductList(Arrays.asList(new Product(12L, "电脑", new BigDecimal("5600"), new Date())));
        String s = productClient.productList(dto);

        return "请求成功category,返回值："+s;
    }


}
