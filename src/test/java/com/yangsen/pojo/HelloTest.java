package com.yangsen.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void sayHello(){
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建对象，without new keyword
        //参数就是Bean的id。最后需要强转
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
        hello.setMessage("China is a great country!");
        System.out.println(hello.getMessage());
    }
}
