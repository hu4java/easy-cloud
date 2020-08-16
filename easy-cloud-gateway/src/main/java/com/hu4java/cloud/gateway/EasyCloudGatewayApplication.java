package com.hu4java.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EasyCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyCloudGatewayApplication.class, args);
    }

}
