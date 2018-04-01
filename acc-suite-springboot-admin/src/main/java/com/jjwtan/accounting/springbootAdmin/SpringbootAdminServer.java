package com.jjwtan.accounting.springbootAdmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ran on 1/4/2018.
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class SpringbootAdminServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminServer.class, args);
    }
}
