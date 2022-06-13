package com.yangsen.pojo;

import com.yangsen.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChildTest {
    @Test
    public void test(){
        //获取上下文
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //获取类
        Child myChild = ctx.getBean("myChild", Child.class);
        //输出 小孩：七七。因为在实体类中@Value注入了这个名字
        System.out.println(myChild.getName());
    }
}
