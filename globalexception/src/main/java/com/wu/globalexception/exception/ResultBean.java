package com.wu.globalexception.exception;

import lombok.Data;

@Data
public class ResultBean {
    private Integer code;
    private String msg;
    private Object data;

    public ResultBean(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public  static ResultBean success(String msg){
        return  new ResultBean(200,msg,null);


    }


}
