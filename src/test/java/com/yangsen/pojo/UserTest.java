package com.yangsen.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test(){
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test2(){
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user);
    }
}
