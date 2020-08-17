package com.itany.cloud.service;

import com.itany.cloud.util.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Service
//@FeignClient("cloud-nacos-provider")
@FeignClient("cloud-gateway")
public interface UserService {

    @GetMapping("/users")
    public ResponseResult findAll();

    @PostMapping("/users")
    public ResponseResult addUser(@RequestParam("username") String username, @RequestParam("password") String password);

    @PutMapping("/users/modifyUser")
    public ResponseResult modifyUser(@RequestParam Map<String, Object> map);

    @GetMapping("/users/findById/{id}")
    public ResponseResult findById(@PathVariable("id") Integer id);

    @DeleteMapping("/users/deleteUserById/{id}")
    public ResponseResult removeUser(@PathVariable("id") Integer id);

}
