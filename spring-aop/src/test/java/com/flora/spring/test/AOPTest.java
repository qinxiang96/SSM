package com.flora.spring.test;

import com.flora.spring.aop.annotation.Calculator;
import com.flora.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author qinxiang
 * @Date 2022/8/5-上午9:29
 */
public class AOPTest {
    @Test
    public void testAOPByAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1, 4);

    }
}
