package com.yangsen.mapper;

import com.yangsen.pojo.User2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("user2Mapper") //声明为Bean id:user2Mapper，
// 默认规则：user2MapperImpl 首字母小写保持驼峰
public class User2MapperImpl implements User2Mapper{
    private SqlSessionTemplate sqlSession;

    @Autowired //自动装配
    @Qualifier("sqlSession") //指定要装配的Bean的ID
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User2> getUserList() {
        User2Mapper mapper = sqlSession.getMapper(User2Mapper.class);
        return mapper.getUserList();
    }
}
