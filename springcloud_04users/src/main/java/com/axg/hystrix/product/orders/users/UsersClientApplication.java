package com.axg.hystrix.product.orders.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UsersClientApplication{

    public static void main(String[] args) {
        SpringApplication.run(UsersClientApplication.class,args);
    }
}
