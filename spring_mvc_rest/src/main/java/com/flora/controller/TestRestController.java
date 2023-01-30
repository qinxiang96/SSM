package com.flora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author qinxiang
 * @Date 2022/8/8-下午10:11
 */
@Controller
public class TestRestController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUser() {
        return "success";
    }
}
