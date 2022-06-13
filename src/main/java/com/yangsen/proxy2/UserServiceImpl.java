package com.yangsen.proxy2;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void del() {
        System.out.println("del");
    }

    @Override
    public void modify() {
        System.out.println("modify");
    }

    @Override
    public void list() {
        System.out.println("list");
    }
}
