package com.itany.cloud.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("Ajax返回的JSON对象")
public class ResponseResult implements Serializable {

    @ApiModelProperty("响应的业务逻辑状态码")
    private String responseCode;
    @ApiModelProperty("响应消息")
    private String message;
    @ApiModelProperty("响应数据")
    private Object returnObject;

    public static ResponseResult success(){
        ResponseResult result = new ResponseResult();
        result.setResponseCode("1001");
        result.setMessage("成功");
        return result;
    }

    public static ResponseResult success(Object returnObject){
        ResponseResult result = new ResponseResult();
        result.setResponseCode("1001");
        result.setMessage("成功");
        result.setReturnObject(returnObject);
        return result;
    }
    public static ResponseResult faliure(){
        ResponseResult result = new ResponseResult();
        result.setResponseCode("1002");
        result.setMessage("失败");
        return result;
    }
    public static ResponseResult faliure(String msg){
        ResponseResult result = new ResponseResult();
        result.setResponseCode("1002");
        result.setMessage(msg);
        return result;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(Object returnObject) {
        this.returnObject = returnObject;
    }
}
