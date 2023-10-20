package com.axg.hystrix.openfign.feign;


import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallBack implements HystrixClient {

    @Override
    public String demo(Integer id) {
        return "服务器开小差了!请稍后再试~";
    }
}
