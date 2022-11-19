package com.wu.globalexception.controller;

import com.wu.globalexception.exception.ResultBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class UserController2 {

        @RequestMapping(value = "/index")
      public ResultBean test() {
               int a=10/0;
                System.out.println("业务执行");
                return ResultBean.success("成功");
      }
}
