package com.sc.microserviceconsumermovieribbonwithhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sc.microserviceconsumermovieribbonwithhystrix.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liao shichuan
 */
@Slf4j
@Service
public class RibbonHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用@HystrixCommand注解指定当该方法发生异常时调用的方法
     * @param id id
     * @return 通过id查询到的用户
     */
    @HystrixCommand(fallbackMethod = "fillback")
    public User findUserById(Long id){
        User user = restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/user/"+id,User.class);
        System.err.println("rpc data >>> " + user);
        return user;
    }
    public User fillback(Long id){
        log.info("调用失败，断路器执行 id >>> " + id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge((short) 0);
        return user;
    }
}
