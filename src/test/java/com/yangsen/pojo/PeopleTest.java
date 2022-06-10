package com.yangsen.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
    @Test
    public void autowire() {
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        People p = context.getBean("people", People.class);
        p.getCat().mew();
        p.getDog().bark();
        System.out.println("-----------");
        People p2 = context.getBean("people2", People.class);
        p2.getCat().mew();
        p2.getDog().bark();
        System.out.println("-----------");
        People p3 = context.getBean("people3", People.class);
        p3.getCat().mew();
        p3.getDog().bark();
        System.out.println("-----------");
    }

    @Test
    public void autowireAnnotation() {
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        People p4 = context.getBean("people4", People.class);
        p4.getCat().mew();
        p4.getDog().bark();
    }
}
