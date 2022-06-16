package com.yangsen.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //标记此类为切面
public class AnnotationPointCut {

    @Before("execution(* com.yangsen.aop1.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("注解-方法执行之前输出");
    }

    @After("execution(* com.yangsen.aop1.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("注解-方法执行之后输出");
    }

    //定义环绕增强，就是前后有
    @Around("execution(* com.yangsen.aop1.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕增强-前");
        //让方法继续执行，非常重要
        Object result = jp.proceed();
        //下面这些方法了解一下
        Signature signature = jp.getSignature();
        //这个签名就是：类.方法()的格式 具有唯一性
        System.out.println("jp的签名："+signature);
        System.out.println("环绕增强-后");
        //记得返回值，不然所有方法返回值将是null
        return result;
    }
}
