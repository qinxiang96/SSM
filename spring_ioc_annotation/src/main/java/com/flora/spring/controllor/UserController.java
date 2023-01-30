package com.flora.spring.controllor;

import com.flora.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author qinxiang
 * @Date 2022/8/3-下午3:15
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
