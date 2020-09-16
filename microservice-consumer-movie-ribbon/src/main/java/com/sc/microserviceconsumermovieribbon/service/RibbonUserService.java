package com.sc.microserviceconsumermovieribbon.service;

import com.sc.microserviceconsumermovieribbon.entity.User;

/**
 * @author liao shichuan
 */
public interface RibbonUserService {
    User findUserById(Long id);
}
