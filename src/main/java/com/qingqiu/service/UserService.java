package com.qingqiu.service;

import com.qingqiu.pojo.User;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/22 14:13
 * @Version 1.0
 */
public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);

    //注册
    void register(String username, String password);
}
