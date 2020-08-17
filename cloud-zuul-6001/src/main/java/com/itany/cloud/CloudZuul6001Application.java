package com.itany.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //启用Zuul的代理
public class CloudZuul6001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuul6001Application.class, args);
    }

}
