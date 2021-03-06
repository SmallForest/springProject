package com.yangsen.mapper;

import com.yangsen.pojo.User2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User2Mapper {
    //定义获取user列表的接口
    List<User2> getUserList();

    int addUser(User2 u);

    void deleteUser(@Param("id") int id);
}
