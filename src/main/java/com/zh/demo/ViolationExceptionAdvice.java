package com.zh.demo;

import com.zh.demo.domain.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

/**
 * @author Administrator
 * @Class Name ViolationExceptionAdvice
 * @Desc 全局数据校验处理异常 {@link ValidationException}
 * @create: 2019-10-28 10:47
 **/

@ControllerAdvice
public class ViolationExceptionAdvice {
    /**
     * 默认情况下，如果校验失败会抛javax.validation.ConstraintViolationException异常，可以用统一异常处理去对这些异常做处理
     */
    @ExceptionHandler(value = ValidationException.class)
    @ResponseBody
    public ResultBean myException(HttpServletRequest request, ConstraintViolationException e) {
        System.out.println("====");
        return ResultBean.isBad("RequestPath = " + request.getServletPath() + ",The detail message = " + e.getMessage());
    }
}
