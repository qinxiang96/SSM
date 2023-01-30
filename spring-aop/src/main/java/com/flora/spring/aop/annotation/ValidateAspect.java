package com.flora.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author qinxiang
 * @Date 2022/8/5-下午2:12
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {
    @Before("execution(* com.flora.spring.aop.annotation.CalculatorImpl.*(..))")
    public void beforeMethod() {
        System.out.println("ValidateAspect-->前置通知");

    }
}
