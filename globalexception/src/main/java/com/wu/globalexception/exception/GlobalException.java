package com.wu.globalexception.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * 全局异常
 */
//定义统一异常
@RestControllerAdvice
public class GlobalException {

    //指定要捕捉异常的类型
    @ExceptionHandler({Exception.class})
    public ResultBean myexception(Exception e){
          //返回异常的信息
           return new ResultBean(5504,"自己抛出的异常",e.getMessage());
    }

}
