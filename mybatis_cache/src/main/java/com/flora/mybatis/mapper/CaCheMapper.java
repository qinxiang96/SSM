package com.flora.mybatis.mapper;

import com.flora.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Author qinxiang
 * @Date 2022/8/1-下午4:15
 */
public interface CaCheMapper {
    /**
     * 根据ID查询员工信息
     *
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     *
     * @param emp
     */
    void insertEmp(Emp emp);
}
