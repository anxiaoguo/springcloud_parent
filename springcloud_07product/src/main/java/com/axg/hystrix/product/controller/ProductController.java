package com.axg.hystrix.product.controller;

import com.axg.hystrix.product.dto.CollectionDaraDTO;
import com.axg.hystrix.product.entity.Product;
import org.springframework.web.bind.annotation.*;

@RequestMapping("product")
@RestController
public class ProductController {


    //没有参数
    @GetMapping("/product")
    public String product() {

        System.out.println("执行product~~~~~");

        return "product ok";
    }


    //queryString 1个参数传参
    @GetMapping("/productOne")
    public String productOne(@RequestParam("id") Long id) {
        System.out.println("接受参数id:" + id);
        return "ok";
    }


    //queryString 2个参数
    @GetMapping("/productTwo")
    public String productTwo(@RequestParam("id") Long id, @RequestParam("name") String name) {
        System.out.println("接收的参数id=" + id + "name=" + name);
        return "ok";
    }

    //路径传参
    @GetMapping("/productUrl/{id}/{name}")
    public String productUrl(@PathVariable("id") Long id, @PathVariable("name") String name) {
        System.out.println("接收的参数id=" + id + "name=" + name);
        return "ok";
    }

    //数组 传参
    @GetMapping("/productArgs")
    public String productArgs(@RequestParam("args") String[] args) {
        for (String arg : args) {
            System.out.println("数组数据==========>" + arg);
        }
        return "ok";
    }


    //这种方式行不通的....
    @GetMapping("/productObjectArgs")
    public String productObjectArgs(@RequestParam("args") Product[] args) {
        for (Product arg : args) {
            System.out.println(arg);
        }
        return "ok";
    }


    //List 传参 要用VO或者DTO封装起来
    @PostMapping("/productList")
    public String productList(@RequestBody CollectionDaraDTO dto) {
        System.out.println(dto);
        return "ok";
    }


    //对象接收参数
    @PostMapping("/productObject")
    public String productObject(@RequestBody Product product) {
        System.out.println("参数：" + product);
        return "对象ok";
    }


}
