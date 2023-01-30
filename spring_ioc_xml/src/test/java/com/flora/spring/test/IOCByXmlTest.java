package com.flora.spring.test;

import com.flora.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author qinxiang
 * @Date 2022/8/2-下午6:01
 */
public class IOCByXmlTest {
    @Test
    public void testIOC() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        Student student = (Student) ioc.getBean("student");
        Student student = (Student) ioc.getBean(Student.class);
        System.out.println(student);
    }
}
