package com.qingqiu.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @ClassName 2211
 * @Description TODO
 * @Author FanYiqing
 * @Date 2024/6/22 14:14
 * @Version 1.0
 */
@Data
public class User {
    @NotNull
    private Integer id;
    private String username;
    @JsonIgnore
    private String password;
}
