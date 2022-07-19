package com.yy.kafka.com.listener;

import com.yy.kafka.com.event.CustomizeMsgEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

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
        kafkaTemplate.send(TOPIC_NAME, "1", event.getData());
    }
}
