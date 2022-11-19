package com.example.filterdemo.controller;

import com.example.filterdemo.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * 这个requestmapping 也要填写参数
     * @param name
     * @return
     */
    @RequestMapping("user/{name}")
    public User getName(@PathVariable String name){
        return new User("200","访问成功");
    }
}
