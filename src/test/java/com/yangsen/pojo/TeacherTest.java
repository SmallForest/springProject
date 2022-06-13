package com.yangsen.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {
    @Test
    public void test(){
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
