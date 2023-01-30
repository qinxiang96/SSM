package com.flora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author qinxiang
 * @Date 2022/8/7-上午9:58
 */
@Controller
public class ProtalController {
    @RequestMapping("/")
    public String protal() {
        return "index";
    }
}
