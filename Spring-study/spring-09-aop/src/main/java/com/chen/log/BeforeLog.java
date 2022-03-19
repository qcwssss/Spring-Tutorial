package com.chen.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Method '" + method.getName() + "' of class"
                + target.getClass().getName() + "executed.");
    }
}
