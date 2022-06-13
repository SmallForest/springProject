package com.yangsen.proxy2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //userService.add();

        //声明代理类
        UserServiceProxy proxy = new UserServiceProxy(userService);
        //代理类中织入了新的功能，扩展了功能，单一职责不影响目标类功能
        proxy.add();
        proxy.del();

    }
}
