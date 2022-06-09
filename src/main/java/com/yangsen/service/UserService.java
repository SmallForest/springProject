package com.yangsen.service;

import com.yangsen.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
