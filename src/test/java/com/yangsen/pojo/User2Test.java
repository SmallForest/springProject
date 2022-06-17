package com.yangsen.pojo;

import com.yangsen.mapper.User2Mapper;
import com.yangsen.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class User2Test {
    @Test
    public void Users() {
        //获取sqlSession
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            //获取mapper
            User2Mapper mapper = sqlSession.getMapper(User2Mapper.class);
            //获取列表
            List<User2> userList = mapper.getUserList();
            for (User2 user2 : userList) {
                System.out.println(user2);
            }
        }
    }

    @Test
    public void Users2() {
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User2Mapper mapper = context.getBean("user2Mapper", User2Mapper.class);
        List<User2> userList = mapper.getUserList();
        for (User2 user2 : userList) {
            System.out.println(user2);
        }
    }

    @Test
    public void Users3() {
        //实例化一个容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User2Mapper mapper = context.getBean("user3Mapper", User2Mapper.class);
        List<User2> userList = mapper.getUserList();
        for (User2 user2 : userList) {
            System.out.println(user2);
        }
    }
}
