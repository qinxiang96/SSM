package com.flora.spring.test;

import com.flora.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author qinxiang
 * @Date 2022/8/2-下午4:44
 */
public class HelloWorldTest {
    @Test
    public void test() {
//        获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取IOC容器的bean
        HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloworld");
        helloWorld.sayHello();

    }
}
