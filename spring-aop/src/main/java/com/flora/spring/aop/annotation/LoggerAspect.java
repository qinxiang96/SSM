package com.flora.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author qinxiang
 * @Date 2022/8/4-下午10:20
 */
@Component
@Aspect
public class LoggerAspect {
    //@Before("execution(public int com.flora.spring.aop.annotation.CalculatorImpl.add(int, int))")
    @Before("execution(* com.flora.spring.aop.annotation.CalculatorImpl.*(..))")
    public void beforeAdviceMethod() {
        System.out.println("LoggerAspect,前置通知");
    }
}
