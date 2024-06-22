package com.qingqiu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/22 14:04
 * @Version 1.0
 */
@NoArgsConstructor      //省略无参构造
@AllArgsConstructor     //省略有参构造
@Data                   //省略get set方法
public class Result<T> {
    private Integer code;   //业务状态码  0-成功  1-失败
    private String msg;     //提示信息
    private T data;         //响应数据

    //快速返回操作成功响应结果(带响应数据)
    public static <E> Result<E> success(E data) {
        return new Result<>(0, "操作成功", data);
    }

    //快速返回操作成功响应结果
    public static Result success() {
        return new Result(0, "操作成功", null);
    }

    //快速返回操作失败响应结果
    public static Result error(String message) {
        return new Result(1, message, null);
    }
}
