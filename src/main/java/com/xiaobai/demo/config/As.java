package com.xiaobai.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class As {
    @Before("execution(* com.xiaobai.demo.config.Testt.*(..))")
    public void fun(){
        System.out.println("aop");
    }
}
