package com.yy.kafka.com.service.impl;

import com.yy.kafka.com.event.CustomizeMsgEvent;
import com.yy.kafka.com.service.TestSendMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ycr
 * @date 2022/7/19 22:10
 */
@Service
public class TestSendMessageServiceImpl implements TestSendMessageService {
    @Resource
    ApplicationContext ApplicationContext;

    @Override
    public void sendMessage(String data) {
        ApplicationContext.publishEvent(new CustomizeMsgEvent<>(data));
    }
}
