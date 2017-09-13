package com.conec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huzuxing on 2017/9/13.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping("")
    public String hello() {
        return "hello";
    }
}
