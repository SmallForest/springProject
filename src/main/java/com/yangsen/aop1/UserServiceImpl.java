package com.yangsen.aop1;

import org.springframework.stereotype.Component;

@Component //bean的ID=userServiceImpl 类名首字母小写保持驼峰的字符串就是Bean的ID
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("package:aop1 add");
    }

    @Override
    public void del() {
        System.out.println("package:aop1 del");
    }

    @Override
    public void modify() {
        System.out.println("package:aop1 modify");
    }

    @Override
    public int list() {
        System.out.println("package:aop1 list");
        return 123;
    }
}
