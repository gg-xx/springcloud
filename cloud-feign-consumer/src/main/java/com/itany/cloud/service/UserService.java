package com.itany.cloud.service;

import com.itany.cloud.util.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Service
//@FeignClient(value = "cloud-zuul",fallback = UserServiceFallback.class)
@FeignClient(value = "cloud-gateway",fallback = UserServiceFallback.class)
public interface UserService {

//    @GetMapping("/v3/userService/users/ribbon/{id}")
//    public ResponseResult findByIdRibbion(@PathVariable("id") Integer id);
//
//    @GetMapping("/v3/userService/users")
//    public ResponseResult findAll();
//
//    @PostMapping("/v3/userService/users")
//    public ResponseResult addUser(@RequestParam("username") String username, @RequestParam("password") String password);
//
//    @PutMapping("/v3/userService/users/modifyUser")
//    public ResponseResult modifyUser(@RequestParam Map<String, Object> map);
//
//    @GetMapping("/v3/userService/users/findById/{id}")
//    public ResponseResult findById(@PathVariable("id") Integer id);
//
//    @DeleteMapping("/v3/userService/users/deleteById/{id}")
//    public ResponseResult removeUser(@PathVariable("id") Integer id);

    @GetMapping("/users/ribbon/{id}")
    public ResponseResult findByIdRibbion(@PathVariable("id") Integer id);

    @GetMapping("/users")
    public ResponseResult findAll();

    @PostMapping("/users")
    public ResponseResult addUser(@RequestParam("username") String username, @RequestParam("password") String password);

    @PutMapping("/users/modifyUser")
    public ResponseResult modifyUser(@RequestParam Map<String, Object> map);

    @GetMapping("/users/findById/{id}")
    public ResponseResult findById(@PathVariable("id") Integer id);

    @DeleteMapping("/users/deleteById/{id}")
    public ResponseResult removeUser(@PathVariable("id") Integer id);

}