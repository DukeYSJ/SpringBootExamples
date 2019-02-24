package com.duke.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Duke on 2019/2/24.
 */
@Controller
public class HelloController {

    @RequestMapping("/freemarker")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("msg", "Hello Duke , this is freemarker");
        return "hello";
    }
}
