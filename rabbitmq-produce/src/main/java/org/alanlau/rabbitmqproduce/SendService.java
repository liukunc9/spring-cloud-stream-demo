package org.alanlau.rabbitmqproduce;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 发送消息通道
 * @author Alan
 * @data 2019/10/13 15:31
 */
public interface SendService {
    @Output("myInput")
    SubscribableChannel sendOrder();
}
