package com.flora.mybatis.mapper;

import com.flora.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author qinxiang
 * @Date 2022/7/30-上午11:42
 */
public interface SelectMapper {
    /**
     * 根据ID查询用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询条数
     *
     * @return
     */
    Integer getCount();

    /**
     * 根据ID查询用户信息作为map输出
     *
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户作为map输出
     *
     * @return
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
