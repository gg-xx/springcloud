package com.itany.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudSentinelService8801Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelService8801Application.class, args);
    }

}
