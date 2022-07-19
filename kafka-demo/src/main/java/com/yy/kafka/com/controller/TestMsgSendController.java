package com.yy.kafka.com.controller;

import com.yy.common.ResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ycr
 * @date 2022/7/19 21:46
 */
@RestController
@RequestMapping("/test")
public class TestMsgSendController {

    @PostMapping("/send/msg")
    public ResponseDTO<String> sendMessage(String data) {

        return ResponseDTO.success();
    }
}
