package com.flora.mybatis.test;

import com.flora.mybatis.mapper.EmpMapper;
import com.flora.mybatis.pojo.Emp;
import com.flora.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author qinxiang
 * @Date 2022/8/2-上午10:42
 */
public class MBGTest {
    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);
    }
}
