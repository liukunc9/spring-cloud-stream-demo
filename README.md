# Spring Cloud Stream 示例项目

#### 介绍
Spring Cloud Stream 的绑定器提供了 RabbitMQ 和 Kafka 两个消息代理中间件的实现。这里演示 RabbitMQ 的使用

#### 使用说明

1. 安装 RabbitMQ ,默认的用户名和密码保持 guest
2. 运行项目顺序是 eureka-server -> rabbitmq-produce -> rabbitmq-consumer
3. 输入 http://localhost:8081/send/Hello%20World ，即可在 rabbitmq-consumer 的Run Dashboard 控制台看到 ```接收到的消息： Hello World```