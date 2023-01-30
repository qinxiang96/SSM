package com.flora.mybatis.test;

import com.flora.mybatis.mapper.DynamicSQLMapper;
import com.flora.mybatis.pojo.Emp;
import com.flora.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author qinxiang
 * @Date 2022/7/31-下午5:40
 */
public class DynamicSQLTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setAge(21);
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        System.out.println(empByCondition);
    }

    @Test
    public void testInsertBanchEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "小芳", 18, "女");
        Emp emp2 = new Emp(null, "小小", 30, "女");
        Emp emp3 = new Emp(null, "大象", 22, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertBenchEmp(emps);
        System.out.println(emps);
    }

    @Test
    public void testDeleteBenchEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = new Integer[]{5, 6};
        mapper.deleteBenchEmp(empIds);
    }
}
