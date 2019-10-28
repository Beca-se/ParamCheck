package com.zh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Administrator
 * @Class Name ParamCheckApplication
 * @Desc 排除数据库自动初始化, 我们只做参数校验, 不写入数据库
 * @create: 2019-10-28 10:27
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ParamCheckApplication {
    public static void main(String[] args) {
        SpringApplication.run(ParamCheckApplication.class, args);
    }
}
