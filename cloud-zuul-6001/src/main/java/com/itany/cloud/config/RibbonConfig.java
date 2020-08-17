package com.itany.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfig {

    @Bean
    public IRule ribbonRule(){
        // 轮询负载均衡,默认值
        return new RoundRobinRule();
        // 基于权重的随机负载均衡
//        return new RandomRule();
        // 最少活跃调用数负载均衡
//        return new WeightedResponseTimeRule();
        // 一致性哈希负载均衡
//        return new BestAvailableRule();
    }

}
