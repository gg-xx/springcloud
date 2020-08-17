package com.itany.cloud.controller;

import com.itany.cloud.entity.User;
import com.itany.cloud.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Api(tags = "用户模块相关的API接口")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String GLOBAL_URL = "http://localhost:6002/users";

    @ApiOperation(value = "查询所有用户信息",notes = "备注:该功能后期被xxx修改")
    @GetMapping
    public ResponseResult findAll(){
        return restTemplate.getForObject(GLOBAL_URL, ResponseResult.class);
    }

    @ApiOperation("根据主键查询用户信息")
    @ApiImplicitParam(name = "id",value = "用户编号,主键",dataType = "Integer",required = true)
    @GetMapping("/{id}")
    public ResponseResult findById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(GLOBAL_URL+"/findById/{id}", ResponseResult.class,id);
    }

    @ApiOperation("添加用户信息")
    @ApiImplicitParams(value={
            @ApiImplicitParam(name = "username",value = "用户名",required = true),
            @ApiImplicitParam(name = "password",value = "密码",required = true)
    })
    @PostMapping
    public ResponseResult addUser(User user){
        MultiValueMap params = new LinkedMultiValueMap();
        params.add("username",user.getUsername());
        params.add("password",user.getPassword());
        return restTemplate.postForObject(GLOBAL_URL,params,ResponseResult.class);
    }

    @ApiOperation("修改指定的用户信息")
    @PutMapping
    public ResponseResult modifyUser(User user){
        String url = new StringBuffer()
                .append(GLOBAL_URL)
                .append("/modifyById?id={id}")
                .append("&username={username}")
                .append("&password={password}")
                .toString();
        ResponseEntity<ResponseResult> entity = restTemplate.exchange(url, HttpMethod.PUT, null, ResponseResult.class, user.getId(), user.getUsername(), user.getPassword());
        return entity.getBody();
    }

    //    @ApiIgnore
    @ApiOperation("删除指定的用户信息")
    @DeleteMapping("/{id}")
    public ResponseResult deleteUser(@PathVariable("id") Integer id){
        ResponseEntity<ResponseResult> entity = restTemplate.exchange(GLOBAL_URL + "/deleteById/{id}", HttpMethod.DELETE, null, ResponseResult.class, id);
        return entity.getBody();
    }

}

