package com.sc.microserviceconsumermoviefeign.client;

import com.sc.microserviceconsumermoviefeign.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 断路器功能
 * @author liao shichuan
 */
@Slf4j
//@Component
public class HystrixClientFallback implements FeignTestClient {
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
