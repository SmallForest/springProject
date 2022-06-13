package com.yangsen.proxy;

public class Client {
    public static void main(String[] args) {
        //实例化房东类
        Landlord landlord = new Landlord();
        //实例化代理类
        Proxy proxy = new Proxy(landlord);
        //invoke 卖房方法
        proxy.SaleHouse();
    }
}
