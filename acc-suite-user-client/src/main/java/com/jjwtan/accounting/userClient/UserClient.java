package com.jjwtan.accounting.userClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Ran on 1/4/2018.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserClient {
    public static void main(String[] args) {
        SpringApplication.run(UserClient.class, args);
    }
}
