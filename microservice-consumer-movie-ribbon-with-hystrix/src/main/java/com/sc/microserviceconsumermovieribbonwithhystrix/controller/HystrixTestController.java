package com.sc.microserviceconsumermovieribbonwithhystrix.controller;

import com.sc.microserviceconsumermovieribbonwithhystrix.entity.User;
import com.sc.microserviceconsumermovieribbonwithhystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liao shichuan
 */
@RestController
public class HystrixTestController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/x/{id}")
    public User findUserById(@PathVariable Long id){
        return ribbonHystrixService.findUserById(id);
    }
}
