package com.yangsen.dao;

public class UserDaoImplOfEs implements UserDao {

    @Override
    public void getUser() {
        System.out.println("从elasticSearch中查询");
    }
}
