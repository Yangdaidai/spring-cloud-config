package com.young.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package PACKAGE_NAME
 * @ClassName com.young.config.server.ConfigServerApplication
 * @Description config server
 * @Author young
 * @Modify young
 * @Date 2020/3/1 22:41
 * @Version 1.0.0
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
