package com.yangsen.proxy;

public class Landlord implements SaleHouse{

    @Override
    public void SaleHouse() {
        System.out.println("房东销售出去了自己的房子");
    }
}
