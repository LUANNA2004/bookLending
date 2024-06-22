package com.qingqiu.mapper;

import com.qingqiu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/22 15:24
 * @Version 1.0D
 */
@Mapper
public interface UserMapper {

    //根据用户名查询用户
     User findByUserName(@Param("username") String username);


    //添加用户
    void addUser(@Param("username") String username,@Param("password") String password);
}
