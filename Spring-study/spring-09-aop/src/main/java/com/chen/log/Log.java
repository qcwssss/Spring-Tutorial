package com.chen.log;

import java.lang.reflect.Method;

public class Log {

    public static void stdLog(Method method, Object[] args, Object target) {
        System.out.println("Method '" + method.getName() + "' of class "
                + target.getClass().getName() + " executed.");
    }
}
