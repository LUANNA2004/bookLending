package com.qingqiu.controller;

import com.qingqiu.pojo.Result;
import com.qingqiu.pojo.User;
import com.qingqiu.service.UserService;
import com.qingqiu.utils.Md5Util;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/22 14:11
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@Param("username") String username,
                           @Param("password") String password){
        //查询用户
        User u =  userService.findByUserName(username);
        if(u==null){
            userService.register(username,password);
            return Result.success();
        }else{
            //占用
            return Result.error("用户名已被占用");
        }
    }

    @PostMapping("/login")
    public Result<String> login(@Param("username") String username,
                                @Param("password") String password){
        //根据用户名查询用户
        User loginUser = userService.findByUserName(username);

        //判断该用户是否存在
        if(loginUser==null){
            return Result.error("用户名错误");
        }

        //判断密码是否正确 loginUser对象中的password是密文
        if(Md5Util.getMD5String(password).equals(loginUser.getPassword())){
            //登录成功
            return Result.success();
        }

        return Result.error("密码错误");

    }
}
