package com.duke.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Duke on 2019/2/23.
 */
@RestController
public class HelloController {

    @RequestMapping("/zip")
    public String hello() {
        return "Hello,Zip";
    }
}
