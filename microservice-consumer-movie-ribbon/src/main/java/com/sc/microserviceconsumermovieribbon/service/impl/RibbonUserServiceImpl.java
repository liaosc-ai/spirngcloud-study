package com.sc.microserviceconsumermovieribbon.service.impl;

import com.sc.microserviceconsumermovieribbon.entity.User;
import com.sc.microserviceconsumermovieribbon.service.RibbonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liao shichuan
 */
@Service
public class RibbonUserServiceImpl implements RibbonUserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User findUserById(Long id) {
        // http://ip:port/user/{id}
        User user = restTemplate.getForObject("http://microservice-provider-user/user/"+id,User.class);
        System.err.println("remote fetch info >>> " + user);
        return user;
    }
}
