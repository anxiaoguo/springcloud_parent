package com.axg.category.feign;


import com.axg.category.dto.CollectionDaraDTO;
import com.axg.category.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "PRODUCT",path = "product")
public interface ProductClient {


    @GetMapping("/product")
    String product();

    @GetMapping("/productOne")
    String productOne(@RequestParam("id") Long id);

    @GetMapping("/productTwo")
    String productTwo(@RequestParam("id") Long id, @RequestParam("name") String name);

    @GetMapping("/productUrl/{id}/{name}")
    String productUrl(@PathVariable("id") Long id, @PathVariable("name") String name);


    @PostMapping("/productObject")
    String productObject(@RequestBody Product product);


    @GetMapping("/productArgs")
    String productArgs(@RequestParam("args") String[] args);


    @PostMapping("/productList")
    String productList(@RequestBody CollectionDaraDTO dto);

}
