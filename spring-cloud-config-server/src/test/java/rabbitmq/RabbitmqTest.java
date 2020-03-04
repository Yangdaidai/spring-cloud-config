package rabbitmq;

import com.young.config.server.ConfigServerApplication;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package PACKAGE_NAME
 * @ClassName rabbitmq.RabbitmqTest
 * @Description rabbitmq 发送端测试
 * @Author young
 * @Modify young
 * @Date 2020/3/2 23:01
 * @Version 1.0.0
 **/
@RunWith(SpringRunner.class)    // 固定写法
@SpringBootTest(classes = ConfigServerApplication.class)    // SpringBoot启动类（自定义的）
@Ignore
public class RabbitmqTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;  // 注入一个RabbitMQ的模板对象，操作消息队列的对象


    private final static String QUEUE_NAME = "hello";

    // 发送一条点对点（Direct）的消息，又称为直连
    @Test
    public void sendQueue(){
        System.out.println("开始向队列中发送一条消息！");
        // 参数1：管理中的队列名  参数2：发送的消息
        rabbitTemplate.convertAndSend(QUEUE_NAME,"message:这是一条消息！");
        System.out.println("消息发送完毕！");
    }

}
