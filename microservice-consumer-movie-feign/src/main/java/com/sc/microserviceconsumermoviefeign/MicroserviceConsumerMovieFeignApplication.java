package com.sc.microserviceconsumermoviefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;

/**
 * 负载均衡暂时使用
 * EnableFeignClients 开启 Feign
 * @author liaosc
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieFeignApplication.class, args);
    }

}
