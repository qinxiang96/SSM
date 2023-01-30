package com.flora.mybatis.test;

import com.flora.mybatis.mapper.CaCheMapper;
import com.flora.mybatis.pojo.Emp;
import com.flora.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @Author qinxiang
 * @Date 2022/8/1-下午4:38
 */
public class CacheMapperTest {
    @Test
    public void testGetEmpById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CaCheMapper mapper = sqlSession.getMapper(CaCheMapper.class);
        Emp empById1 = mapper.getEmpById(7);
        System.out.println(empById1);
        Emp emp = new Emp(null, "想你", 25, "女");
        mapper.insertEmp(emp);
        Emp empById2 = mapper.getEmpById(7);
        System.out.println(empById2);
    }
}
