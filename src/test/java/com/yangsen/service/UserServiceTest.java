package com.yangsen.service;

import com.yangsen.dao.UserDao;
import com.yangsen.dao.UserDaoImpl;
import com.yangsen.dao.UserDaoImplOfEs;
import com.yangsen.dao.UserDaoImplOfMysql;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void test() {
        //利用构造器注入实现类对象----像这样，将对象的创建控制权交给调用者的方式就是控制反转IOC
        UserService userService = new UserServiceImpl(new UserDaoImpl());
        userService.getUser();

        //利用setter注入实现类对象
        userService.setUserDao(new UserDaoImplOfEs());
        userService.getUser();

        //利用setter注入实现类对象
        userService.setUserDao(new UserDaoImplOfMysql());
        userService.getUser();
    }
    @Test
    public void testContainer(){
        //获取容器对象
        ApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //从容器中获取UserService类的对象
        UserService userService = (UserService) context.getBean("UserServiceImpl");
        userService.getUser();

        //切换查询方式
        userService.setUserDao((UserDao) context.getBean("UserDaoImplOfEs"));
        userService.getUser();

        userService.setUserDao((UserDao) context.getBean("UserDaoImplOfMysql"));
        userService.getUser();

        userService = (UserService) context.getBean("UserServiceImpl2");
        userService.getUser();
    }
}
