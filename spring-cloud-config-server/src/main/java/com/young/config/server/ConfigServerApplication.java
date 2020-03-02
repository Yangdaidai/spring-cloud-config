package com.young.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.config.server
 * @ClassName com.young.config.server.ConfigServerApplication
 * @Description config server
 * @Author young
 * @Modify young
 * @Date 2020/3/1 22:41
 * @Version 1.0.0
 **/
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
