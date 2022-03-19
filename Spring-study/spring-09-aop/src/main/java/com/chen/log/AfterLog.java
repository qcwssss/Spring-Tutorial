package com.chen.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Method '" + method.getName() + "' of class"
                + target.getClass().getName() + "executed.\n" + "Return value is: " + returnValue);
    }
}
