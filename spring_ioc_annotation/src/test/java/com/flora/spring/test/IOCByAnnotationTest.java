package com.flora.spring.test;

import com.flora.spring.controllor.UserController;
import com.flora.spring.dao.UserDao;
import com.flora.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author qinxiang
 * @Date 2022/8/3-下午3:53
 */
public class IOCByAnnotationTest {
    @Test
    public void testAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);
        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);
        userController.saveUser();


    }
}
