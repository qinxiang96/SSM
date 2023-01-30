package com.flora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author qinxiang
 * @Date 2022/8/6-下午8:32
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String protal() {
        return "index";

    }

    @RequestMapping("/hello")
    public String hello() {
        return "success";

    }
}
