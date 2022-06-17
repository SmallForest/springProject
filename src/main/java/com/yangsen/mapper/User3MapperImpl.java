package com.yangsen.mapper;

import com.yangsen.pojo.User2;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("user3Mapper") //声明为Bean id:user3Mapper，
// 默认规则：user3MapperImpl 首字母小写保持驼峰
public class User3MapperImpl extends SqlSessionDaoSupport implements User2Mapper{

    @Override
    @Autowired //自动装配
    @Qualifier("sqlSessionFactory") //为父类注入sqlSessionFactory
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User2> getUserList() {
        //getMapper参数还应该是接口类
        return getSqlSession().getMapper(User2Mapper.class).getUserList();
    }
}
