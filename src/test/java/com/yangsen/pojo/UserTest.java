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

    @Test
    public void beanScopes(){
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //单例模式
        User user1 = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        //true
        System.out.println(user1==user2);

        //原型模式
        User user3 = (User) context.getBean("user2");
        User user4 = (User) context.getBean("user2");
        //false
        System.out.println(user3==user4);
    }
}
