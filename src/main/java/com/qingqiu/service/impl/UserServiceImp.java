package com.qingqiu.service.impl;

import com.qingqiu.mapper.UserMapper;
import com.qingqiu.pojo.User;
import com.qingqiu.service.UserService;
import com.qingqiu.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/22 15:22
 * @Version 1.0
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    ///查询用户表中是否有该用户，调用方法查询该用户
    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }

    //注册用户
    @Override
    public void register(String username, String password) {
        //加密
        String md5String = Md5Util.getMD5String(password);
        //添加
        userMapper.addUser(username,md5String);
    }

}
