package com.itany.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosProvider9006Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosProvider9006Application.class, args);
    }

}
