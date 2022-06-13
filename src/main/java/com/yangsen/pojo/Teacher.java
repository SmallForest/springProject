package com.yangsen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //声明这是一个Bean，作用等同于<bean id="" class=""></bean>
@Scope(value = "prototype") //作用等同 <bean id="" class="" scope="prototype"/>
public class Teacher {

    @Value("张老师") //为属性赋值，作用等同于 <bean>标签内的<property>
    private String name;

    @Value("李老师") //为setter指定默认值，也可以的
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
