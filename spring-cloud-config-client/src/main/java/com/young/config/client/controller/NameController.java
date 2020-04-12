package com.young.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.config.client.controller
 * @ClassName NameController
 * @Description 获取配置信息
 * @Author young
 * @Modify young
 * @Date 2020/3/2 13:03
 * @Version 1.0.0
 **/
@RefreshScope
@RestController
public class NameController {

    @Value("${config.name}")
    private String name;

    @Value("${client.spring-cloud-config-client.appNme}")
    private String appName;

    @RequestMapping("/name")
    public String name() {
        return this.name;
    }

    @RequestMapping("/appName")
    public String appName() {
        System.out.println("appName = " + appName);
        return this.appName;
    }
}
