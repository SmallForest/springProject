package com.yangsen.proxy2;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userServiceImpl;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void del() {
        log("del");
        userServiceImpl.del();
    }

    @Override
    public void modify() {
        log("modify");
        userServiceImpl.modify();
    }

    @Override
    public void list() {
        log("list");
        userServiceImpl.list();
    }

    public void log(String msg) {
        System.out.println("调用了" + msg);
    }
}
