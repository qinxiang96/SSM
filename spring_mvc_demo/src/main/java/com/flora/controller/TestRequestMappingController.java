package com.flora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author qinxiang
 * @Date 2022/8/7-上午9:58
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //    此时控制器的请求路径为/test/hello
    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest requrst) {
        String username = requrst.getParameter("username");
        String password = requrst.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        return "success";

    }

    @RequestMapping("/param")

    public String getParam(@RequestParam(value = "username", required = true) String username, String password) {
        System.out.println("username:" + username + ",password:" + password);

        return "success";
    }

    @RequestMapping("/mav")
    public ModelAndView testMAV() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("testScope", "Hello kitty");
        mav.setViewName("success");
        return mav;
    }
}
