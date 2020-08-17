package com.itany.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.itany.cloud.service")
public class CloudNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosConsumerApplication.class, args);
    }

}
