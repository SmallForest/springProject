package com.yangsen.proxy;

public class Proxy implements SaleHouse {
    //定义一个房东属性
    private Landlord landlord;

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void SaleHouse() {
        seeHouse();
        signContract();
        landlord.SaleHouse();
        fare();
    }

    //代理特有的附加操作
    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    //代理特有的附加操作
    public void signContract() {
        System.out.println("签合同");
    }

    //代理特有的附加操作
    public void fare() {
        System.out.println("收中介费");
    }
}
