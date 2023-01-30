package com.flora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author qinxiang
 * @Date 2022/8/8-下午12:16
 */
@Controller
public class TestScopeController {
    @RequestMapping("/session")
    public String testSession(HttpSession session) {
        session.setAttribute("testSessionScope", "hello session");
        return "success";
    }
}
