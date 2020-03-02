package com.young.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.config.client
 * @ClassName com.young.config.client.ConfigClientApplication
 * @Description config server
 * @Author young
 * @Modify young
 * @Date 2020/3/1 22:41
 * @Version 1.0.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
