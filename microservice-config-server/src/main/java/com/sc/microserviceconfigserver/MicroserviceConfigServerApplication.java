package com.sc.microserviceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 通过@EnableConfigServer注解激活配置服务.
 * 说明：
 * 在application.yml中有个git.uri的配置，目前配置的是https://github.c
 om/eacdy/spring-cloud-study/
 * 获取git上的资源信息遵循如下规则：
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 *
 * 例如本例：可使用以下路径来访问microservice-config-client-dev.prope
 rties：
 * http://localhost:8040/microservice-config-client-dev.properti
 es
 * http://localhost:8040/microservice-config-client/dev
 * ...
 * @author eacdy
 */
@EnableConfigServer
@SpringBootApplication
public class MicroserviceConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigServerApplication.class, args);
    }

}
