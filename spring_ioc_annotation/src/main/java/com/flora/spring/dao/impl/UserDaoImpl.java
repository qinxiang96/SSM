package com.flora.spring.dao.impl;

import com.flora.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author qinxiang
 * @Date 2022/8/3-下午3:17
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("保存成功");
    }
}
