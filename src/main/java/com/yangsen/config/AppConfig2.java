package com.yangsen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yangsen.pojo")//此注释启用组件扫描，寻找@Component修饰的类
public class AppConfig2 {
}
