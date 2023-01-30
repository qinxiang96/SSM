package com.flora.mybatis.mapper;

import com.flora.mybatis.pojo.User;

import java.util.List;

/**
 * @Author qinxiang
 * @Date 2022/7/28-下午5:09
 */
public interface UserMapper {
    /**
     * 添加用户信息
     *
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户
     */
    void deleteUser();

    /**
     * 根据id获取user对象
     *
     * @return
     */
    User getUserById();

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<User> getAllUser();
}
