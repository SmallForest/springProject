package com.yangsen.pojo;

import com.yangsen.mapper.User2Mapper;
import com.yangsen.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
}
