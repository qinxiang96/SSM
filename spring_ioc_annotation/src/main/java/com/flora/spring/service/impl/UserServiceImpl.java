package com.flora.spring.service.impl;

import com.flora.spring.dao.UserDao;
import com.flora.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author qinxiang
 * @Date 2022/8/3-下午3:38
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void saveUser() {
        userDao.saveUser();
        System.out.println("保存");
    }
}
