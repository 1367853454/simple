package com.major.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/")
    public String hello() {
        return "你他妈快给老子配个钥匙，我晚上的快递应该到了先别帮我拿。";
    }

}
