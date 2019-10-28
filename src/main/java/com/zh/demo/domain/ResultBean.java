package com.zh.demo.domain;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author zhouhu
 * @Class Name ResultBean
 * @Desc The response to front class
 * @create: 2019-09-05 14:26
 **/
@Data
public class ResultBean {
    private int code;
    private String message;
    private Object data;

    public static ResultBean isOK(String message) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(HttpStatus.OK.value());
        resultBean.setMessage(message);
        resultBean.setData(null);
        return resultBean;
    }

    public static ResultBean isOK(String message, Object object) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(HttpStatus.OK.value());
        resultBean.setMessage(message);
        resultBean.setData(object);
        return resultBean;
    }

    public static ResultBean isBad(String message) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(HttpStatus.BAD_REQUEST.value());
        resultBean.setMessage(message);
        return resultBean;
    }

    public static ResultBean isBad(String message, String field) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(HttpStatus.BAD_REQUEST.value());
        resultBean.setMessage(message);
        resultBean.setData(field);
        return resultBean;
    }

    public static ResultBean isError(String message) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        resultBean.setMessage(message);
        resultBean.setData(null);
        return resultBean;
    }

}
