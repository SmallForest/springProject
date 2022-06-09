package com.yangsen.dao;

public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("从Redis中查询");
    }
}
