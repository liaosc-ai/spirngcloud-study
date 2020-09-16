package com.sc.microserviceconsumermoviefeign.client;

import com.sc.microserviceconsumermoviefeign.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 *
 * @author liao shichuan
 * @FeignClient(url = "www.baidu.com")
 * feign 自带断路器功能 hystrix
 */

@FeignClient(name = "MICROSERVICE-PROVIDER-USER", fallback = FeignTestClient.HystrixClientFallbackinner.class)
public interface FeignTestClient {

    @RequestMapping("/user/{id}")
    User findUserById(@RequestParam("id") Long id);

    @Component
    @Slf4j
    @SuppressWarnings("all")
    static class HystrixClientFallbackinner implements FeignTestClient {
        @Override
        public User findUserById(Long id) {
            log.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
            User user = new User();
            user.setId(-1L);
            user.setUsername("default username");
            user.setAge((short) 0);
            return user;
        }
    }
}
