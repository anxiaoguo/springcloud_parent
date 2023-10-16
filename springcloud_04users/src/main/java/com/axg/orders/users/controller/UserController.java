package com.axg.orders.users.controller;

import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {



    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/getUser")
    public String getUser() {

//        RestTemplate restTemplate = new RestTemplate();
//        String forObject = restTemplate.getForObject("http://localhost:9002/order/list", String.class);


//        List<ServiceInstance> orders = discoveryClient.getInstances("ORDERS");
//        System.out.println(orders);


//        ServiceInstance orders = loadBalancerClient.choose("ORDERS");

        String forObject = restTemplate.getForObject("http://ORDERS/order/list", String.class);
        return forObject;

//        return "ok,调用的订单服务主机是："+orders.getHost()+"端口为:"+orders.getPort();

    }


}
