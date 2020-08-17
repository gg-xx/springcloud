package com.itany.cloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootConfiguration
public class MyConfig {
    // 自定义bean,将指定的bean交给Spring管理
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
