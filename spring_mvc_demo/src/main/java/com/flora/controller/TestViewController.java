package com.flora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author qinxiang
 * @Date 2022/8/8-下午2:36
 */
@Controller
public class TestViewController {
    @RequestMapping("/application")
    public String testThymeleafView() {
        return "success";
    }
}
