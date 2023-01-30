package com.flora.mybatis.mapper;

import com.flora.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author qinxiang
 * @Date 2022/7/31-下午5:26
 */
public interface DynamicSQLMapper {
    /**
     * 根据条件查询员工信息
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 批量添加员工
     *
     * @param emps
     */
    void insertBenchEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除员工
     *
     * @param empIds
     */
    void deleteBenchEmp(@Param("empIds") Integer[] empIds);
}
