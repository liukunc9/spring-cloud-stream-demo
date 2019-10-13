package org.alanlau.rabbitmqproduce.controller;

import org.alanlau.rabbitmqproduce.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息发送
 *
 * @author Alan
 * @data 2019/10/13 15:33
 */
@RestController
public class ProducerController {
    @Autowired
    SendService sendService;

    @GetMapping("/send/{message}")
    public String sendRequest(@PathVariable("message") String message) {
        //创建消息
        Message msg = MessageBuilder.withPayload(message.getBytes()).build();
        //发送消息
        sendService.sendOrder().send(msg);

        return "SUCCESS";
    }
}
