package com.wu.globalexception.acctuator;

import com.wu.globalexception.exception.ResultBean;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Endpoint(id = "userEnpoint")
public class MyEnpoint {

    @ReadOperation
    public ResultBean userINfo(){
        Message message = new Message();
        message.setDate(new Date());
        message.setUser(3);
        return new ResultBean(200,"自定义端点",message);
    }

}
