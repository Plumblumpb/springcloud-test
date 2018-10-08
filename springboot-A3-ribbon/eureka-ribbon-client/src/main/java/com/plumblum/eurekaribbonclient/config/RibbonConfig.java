package com.plumblum.eurekaribbonclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RibbonConfig {

    @Bean
//    开启负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
