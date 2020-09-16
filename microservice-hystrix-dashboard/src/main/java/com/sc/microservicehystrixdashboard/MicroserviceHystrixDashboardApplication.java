package com.sc.microservicehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author liaosc
 */
@EnableHystrixDashboard
@SpringBootApplication
public class MicroserviceHystrixDashboardApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MicroserviceHystrixDashboardApplication.class, args);
        new SpringApplicationBuilder(MicroserviceHystrixDashboardApplication.class).web(true).run(args);
    }

}
