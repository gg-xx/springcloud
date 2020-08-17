package com.itany.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启用Eureka客户端
public class CloudEurekaProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaProvider8002Application.class, args);
    }

}
