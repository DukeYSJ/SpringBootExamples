package com.duke.learn.controller;

import org.springframework.stereotype.Controller;

/**
 * @Author Duke
 * @CreateDate 2019-02-28-0:32
 */
@Controller
public class HelloController {

    //@RequestMapping
    public String hello() {

        return "hello,gradle";
    }


}
