package com.zh.demo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Administrator
 * @Class Name User
 * @Desc TODO
 * @create: 2019-10-28 10:35
 **/
@Data
public class User {
    private String userName;
    private String password;
    @NotBlank(message = "The type can't be null or empty!")
    @Size(max = 10, message = "The type max length  is 10!")
    private String type;

    private String token;
}
