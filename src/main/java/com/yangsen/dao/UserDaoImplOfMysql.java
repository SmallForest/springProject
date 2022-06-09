package com.yangsen.dao;

public class UserDaoImplOfMysql implements UserDao {

    @Override
    public void getUser() {
        System.out.println("从Mysql中查询");
    }
}
