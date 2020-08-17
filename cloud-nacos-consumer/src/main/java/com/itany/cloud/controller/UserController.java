package com.itany.cloud.controller;

import com.itany.cloud.entity.User;
import com.itany.cloud.service.UserService;
import com.itany.cloud.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseResult findAll(){
        return userService.findAll();
    }

    @PostMapping
    public ResponseResult addUser(User user){
        return userService.addUser(user.getUsername(),user.getPassword());
    }

    @PutMapping("/modifyUser")
    public ResponseResult modifyUser(@RequestParam Map<String,Object> map){
        return userService.modifyUser(map);
    }

    @GetMapping("/findById/{id}")
    public ResponseResult findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public ResponseResult removeUser(@PathVariable("id") Integer id){
        return userService.removeUser(id);
    }

}
