package com.yy.kafka.com.controller;

import com.yy.common.ResponseDTO;
import com.yy.kafka.com.service.TestSendMessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ycr
 * @date 2022/7/19 21:46
 */
@RestController
@RequestMapping("/test")
public class TestMsgSendController {

    @Resource
    private TestSendMessageService testSendMessageService;

    @PostMapping("/send/msg")
    public ResponseDTO<String> sendMessage(@RequestBody String data) {
        testSendMessageService.sendMessage(data);
        return ResponseDTO.success();
    }
}
