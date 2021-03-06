package com.itany.cloud.controller;

import com.itany.cloud.entity.User;
import com.itany.cloud.util.ResponseResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Integer, User> users = new HashMap<>();
    static Integer id = 1;

    @GetMapping
    public ResponseResult findAll(){
        List<User> list = new ArrayList<>(users.values());
        return ResponseResult.success(list);
    }

    @PostMapping
    public ResponseResult addUser(User user){
        user.setId(id++);
        users.put(user.getId(),user);
        return ResponseResult.success();
    }

    @GetMapping("/findById/{id}")
    public ResponseResult findById(@PathVariable int id){
        User user = users.get(id);
        return ResponseResult.success(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseResult deleteById(@PathVariable int id){
        User remove = users.remove(id);
        if(remove==null){
            return ResponseResult.faliure("没有该数据");
        }
        return ResponseResult.success();
    }
    @PutMapping("/modifyById")
    public ResponseResult modifyById(User user){
        if (users.get(user.getId())!=null){
            users.put(user.getId(),user);
            return ResponseResult.success();
        }
        return ResponseResult.faliure("修改失败");
    }
}
