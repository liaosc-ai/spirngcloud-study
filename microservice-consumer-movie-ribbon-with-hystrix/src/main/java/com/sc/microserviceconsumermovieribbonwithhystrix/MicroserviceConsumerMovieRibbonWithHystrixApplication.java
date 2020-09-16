package com.sc.microserviceconsumermovieribbonwithhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lsc
 * EnableCircuitBreaker 开启断路器功能
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieRibbonWithHystrixApplication {

    // 开启负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieRibbonWithHystrixApplication.class, args);
    }

}
