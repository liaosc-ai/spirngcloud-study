package com.sc.microserviceprovideruser.dao;

import com.sc.microserviceprovideruser.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liao shichuan
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
