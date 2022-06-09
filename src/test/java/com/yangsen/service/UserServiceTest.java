package com.yangsen.service;

import com.yangsen.dao.UserDaoImpl;
import com.yangsen.dao.UserDaoImplOfEs;
import com.yangsen.dao.UserDaoImplOfMysql;
import org.junit.Test;

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
}
