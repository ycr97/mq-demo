package com.yy.kafka.com.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

/**
 * @author ycr
 * @date 2022/7/19 22:11
 */
public class CustomizeMsgEvent<T> extends ApplicationEvent {
    private T data;

    public CustomizeMsgEvent(T data) {
        super(data);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
