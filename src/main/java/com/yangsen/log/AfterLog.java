package com.yangsen.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class AfterLog implements AfterReturningAdvice {
    /**
     * 参数和Log中的一致，多了一个返回值
     *
     * @param returnValue 返回值
     * @param method      执行的方法
     * @param args        参数
     * @param target      目标类
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("INFO：执行了类："
                + target.getClass().getName()
                + "的" + method.getName()
                + "方法，返回值："
                + returnValue);
    }
}
