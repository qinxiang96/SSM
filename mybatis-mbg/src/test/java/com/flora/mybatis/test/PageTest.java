package com.flora.mybatis.test;

import com.flora.mybatis.mapper.EmpMapper;
import com.flora.mybatis.pojo.Emp;
import com.flora.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author qinxiang
 * @Date 2022/8/2-上午11:55
 */
public class PageTest {
    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        查询前开启分页查询功能
        PageHelper.startPage(1, 4);
        List<Emp> emps = mapper.selectByExample(null);
        for (Emp emp : emps
        ) {
            System.out.println(emp);
        }
//        查询后获取分页的数据
        PageInfo<Emp> pageInfo = new PageInfo<Emp>(emps, 3);
        System.out.println(pageInfo);
    }
}
