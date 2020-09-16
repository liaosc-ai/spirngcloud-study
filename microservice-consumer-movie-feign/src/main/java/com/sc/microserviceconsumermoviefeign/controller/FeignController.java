package com.sc.microserviceconsumermoviefeign.controller;

import com.sc.microserviceconsumermoviefeign.client.FeignTestClient;
import com.sc.microserviceconsumermoviefeign.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liao shichuan
 */
@RestController
public class FeignController {
    @Autowired
    private FeignTestClient feignClient;

    @GetMapping("/feign/user/{id}")
    public User findUserById(@PathVariable Long id){
        User user = feignClient.findUserById(id);
        System.err.println("get user by feign >>> " + user);
        return user;
    }
}
