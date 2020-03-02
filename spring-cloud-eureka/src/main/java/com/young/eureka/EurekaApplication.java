package com.young.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.eureka
 * @ClassName SpringCloudEurekaApplication
 * @Description eureka server
 * @Author young
 * @Modify young
 * @Date 2020/2/29 17:31
 * @Version 1.0.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
