package com.axg.category.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PRODUCT")
public interface ProductClient {


    @GetMapping("/product")
    String product();


}
