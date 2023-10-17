package com.axg.product.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrdersClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersClientApplication.class,args);
    }
}
