package com.yangsen.aop1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {
    @Test
    public void test() {
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //此处的类需要是接口类，不能是目标类，因为动态代理代理的是接口
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.add();
        userService.del();
        userService.modify();
        userService.list();
    }
}
