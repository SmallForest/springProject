package com.yangsen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Child {
    private String name;

    public String getName() {
        return name;
    }

    @Value("小孩：七七")
    public void setName(String name) {
        this.name = name;
    }
}
