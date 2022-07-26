package com.yy.kafka.com.comsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author ycr
 * @date 2022/7/19 22:30
 */
@Component
public class MsgConsumer {

    @KafkaListener(topics = {"test_topic"}, groupId = "test_group")
    public void msgConsumer(ConsumerRecord<String, String> record) {
        System.out.println(record.value());
        try (OutputStreamWriter writer = new OutputStreamWriter(Files.newOutputStream(Paths.get("D:/mq-test.txt")))) {
            writer.write(record.value());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
