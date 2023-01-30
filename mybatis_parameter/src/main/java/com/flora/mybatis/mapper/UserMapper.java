package com.flora.mybatis.mapper;

import com.flora.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author qinxiang
 * @Date 2022/7/29-下午3:35
 */
public interface UserMapper {
    /**
     * 根据用户名获取用户信息
     *
     * @param username
     * @return
     */
    User getUserNameByUsername(String username);

    /**
     * 根据用户密码查询用户
     *
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 根据map参数查询用户
     *
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 根据参数查询用户
     *
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     * 添加用户
     *
     * @param user
     */
    void insertUser(User user);
}
