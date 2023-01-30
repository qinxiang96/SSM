package com.flora.mybatis.mapper;

import com.flora.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Author qinxiang
 * @Date 2022/7/31-上午9:51
 */
public interface DeptMapper {
    /**
     * 分步查询根据员工ID查询员工及部门信息的第二步
     *
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 根据部门ID查询部门信息以及部门中所有的员工信息
     *
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 分步查询根据部门ID查询部门信息以及部门中所有员工信息的第一步
     *
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
