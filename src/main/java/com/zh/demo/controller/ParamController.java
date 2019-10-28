package com.zh.demo.controller;

import com.zh.demo.User;
import com.zh.demo.domain.ResultBean;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Administrator
 * @Class Name ParamController
 * @Desc TODO
 * @create: 2019-10-28 10:29
 **/
@RestController
@Validated
public class ParamController {
    @PostMapping("/user/login")
    public ResultBean login(@RequestBody @Valid User user, BindingResult bindingResult) {
        System.out.println("========");
        return ResultBean.isOK("DFDFDFD");
    }
}
