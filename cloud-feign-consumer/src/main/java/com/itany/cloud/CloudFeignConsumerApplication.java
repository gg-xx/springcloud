package com.itany.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient ///启用Eureka客户端
// 启用feign的客户端
// 启用时指定当前Feign所用注解所在的包
@EnableFeignClients(basePackages = "com.itany.cloud.service")
public class CloudFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignConsumerApplication.class, args);
    }

}
