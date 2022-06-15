package com.yangsen.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class Log implements MethodBeforeAdvice {
    /**
     * 实现before
     *
     * @param method 代理要执行的方法
     * @param args   参数
     * @param target 目标类，也就是我们说的被代理的类
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("INFO：执行了类："
                + target.getClass().getName()
                + "的"
                + method.getName()
                + "方法");
    }
}
