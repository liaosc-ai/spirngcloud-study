package com.sc.microserviceprovideruser.controller;

import com.sc.microserviceprovideruser.dao.UserRepository;
import com.sc.microserviceprovideruser.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liao shichuan
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
    /**
     * 本地服务实例的信息
     * @return
     */
    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.
                getLocalServiceInstance();
        return localServiceInstance;
    }

}
