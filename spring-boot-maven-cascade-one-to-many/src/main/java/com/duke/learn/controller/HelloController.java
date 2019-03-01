package com.duke.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Duke on 2019/3/1.
 */
@RestController
public class HelloController {

    //http://localhost:8090/cascade/one2many/hello
    @RequestMapping("/hello")
    public String hello() {
        return "hello,one to many";
    }

}
