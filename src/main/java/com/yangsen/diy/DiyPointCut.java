package com.yangsen.diy;

import org.springframework.stereotype.Component;

@Component
public class DiyPointCut {
    public void before(){
        System.out.println("方法执行之前输出");
    }
    public void after(){
        System.out.println("方法执行之后输出");
    }
}
