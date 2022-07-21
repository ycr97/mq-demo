package com.yy.kafka.com.listener;

import com.yy.kafka.com.event.CustomizeMsgEvent;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.concurrent.ExecutionException;

/**
 * @author ycr
 * @date 2022/7/19 22:16
 */

@Component
public class MsgListener {

    private static final String TOPIC_NAME = "test_topic";

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @EventListener(classes = {CustomizeMsgEvent.class})
    public void msgMonitor(CustomizeMsgEvent<String> event) {
        try {
            ListenableFuture<SendResult<String, String>> send = kafkaTemplate.send(TOPIC_NAME, "1", event.getData());
            SendResult<String, String> result = send.get();
            ProducerRecord<String, String> producerRecord = result.getProducerRecord();
            System.out.println(producerRecord.topic());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
