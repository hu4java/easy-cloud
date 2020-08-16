package com.hu4java.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EasyCloudAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyCloudAccountServiceApplication.class, args);
    }

}
