package com.flora.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.flora.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author qinxiang
 * @Date 2022/8/3-上午10:39
 */
public class DataSourceTest {
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        DruidDataSource bean = (DruidDataSource) ioc.getBean(DruidDataSource.class);
        DruidPooledConnection connection = bean.getConnection();
        System.out.println(bean);


    }

    @Test
    public void testScope() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);
//        单例
        System.out.println(student1 == student2);

    }
}
