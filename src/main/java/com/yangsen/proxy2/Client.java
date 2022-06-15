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

        //使用动态代理
        System.out.println("======使用动态代理=====");
        //声明动态代理处理器
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //赋值：要被代理的实际实例
        proxyInvocationHandler.setTarget(userService);
        //获取代理类
        UserService dynamicProxy = (UserService) proxyInvocationHandler.getProxy();
        //执行接口中的方法，本例中的是：add del modify list
        dynamicProxy.add();
        dynamicProxy.del();
        dynamicProxy.modify();
        dynamicProxy.list();
        //如何织入log? 直接修改代理处理器？
        //思考：直接修改处理器类感觉还是不太好
    }
}
