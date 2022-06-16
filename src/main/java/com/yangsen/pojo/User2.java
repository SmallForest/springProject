package com.yangsen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//mybatis实体类
@Data //get set toString方法
@AllArgsConstructor //全部参数构造器
@NoArgsConstructor //无参构造器
public class User2 {
    private int id;
    private String name;
    private String pwd;
}
