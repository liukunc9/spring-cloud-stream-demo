package org.alanlau.rabbitmqconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 接收通道
 * @author Alan
 * @data 2019/10/13 15:52
 */
public interface ReceiveService {
    @Input("myInput")
    SubscribableChannel myInput();
}
