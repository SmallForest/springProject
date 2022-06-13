package com.yangsen.config;

import com.yangsen.pojo.Child;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.yangsen.pojo")//此注释启用组件扫描，寻找@Component修饰的类
@Import(AppConfig2.class)//引入其他配置文件，类似xml中的import
public class AppConfig {
    //@Bean注解相当于xml文件中的<bean>标签
    //方法名字相当于 bean.id
    //返回值相当于 bean.class 要注入的类路径，
    //稍微不同的是这里显式实例化了
    @Bean
    public Child myChild() {
        return new Child();
    }
}
