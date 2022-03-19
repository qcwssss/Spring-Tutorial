package com.chen.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("========|| Before execution========");
    }

    @After("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("========|| After execution========");
    }

    @Around("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around");

        Object proceed = joinPoint.proceed();

        System.out.println("after around");

        System.out.println("signature: " + joinPoint.getSignature());
        System.out.println(proceed);

    }
}
