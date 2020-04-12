# spring-cloud-config
   - 配置中心git示例和refresh
   - Spring Cloud Bus(rabbitmq)做配置更新
   - spring cloud 基于gradle构建
   
   
   ## Spring Cloud Bus做配置更新步骤如下:
   -   1、提交代码触发post请求给/actuator/bus-refresh
   -   2、server端接收到请求并发送给Spring Cloud Bus
   -   3、Spring Cloud bus接到消息并通知给其它客户端
   -   4、其它客户端接收到通知，请求Server端获取最新配置
   -   5、全部客户端均获取到最新的配置