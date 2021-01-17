package com.bravelionet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka-production")
public class TestController {
    @Autowired
    KafkaTemplate kafkaTemplate;
    @GetMapping("/test/{test}")
    public String test(@PathVariable("test") String test){
        System.out.println(" 测试成功 : " + test);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(()-> {
                System.out.println("finalI = " + finalI);
               // kafkaTemplate.send("signed", "消--息 " + finalI);
                kafkaTemplate.send("ssss", "消--息 " + finalI);
            }).start();
        }
       // Object o = send.get();
        return "kafka-production 成功!";
    }
}
