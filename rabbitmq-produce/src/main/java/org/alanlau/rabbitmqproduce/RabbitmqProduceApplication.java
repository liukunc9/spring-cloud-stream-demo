package org.alanlau.rabbitmqproduce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(SendService.class)
public class RabbitmqProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProduceApplication.class, args);
    }

}
