package com.yangsen.service;

import com.yangsen.dao.UserDao;
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //或者构造器，要求传递UserDao的实现类对象
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    //利用set注入对象
    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
