package com.itany.cloud.service;

import com.itany.cloud.util.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Service
public class UserServiceFallback implements UserService {
    @Override
    public ResponseResult findByIdRibbion(@PathVariable("id") Integer id) {
        return ResponseResult.faliure("ribbon测试出错");
    }

    @Override
    public ResponseResult findAll() {
        return ResponseResult.faliure("查询所有用户信息时出错");
    }

    @Override
    public ResponseResult findById(Integer id) {
        return ResponseResult.faliure("查询指定用户信息时出错");
    }

    @Override
    public ResponseResult addUser(String username, String password) {
        return ResponseResult.faliure("添加用户信息时出错");
    }

    @Override
    public ResponseResult modifyUser(Map<String, Object> map) {
        return ResponseResult.faliure("修改指定用户信息时出错");
    }

    @Override
    public ResponseResult removeUser(Integer id) {
        return ResponseResult.faliure("删除指定用户信息时出错");
    }
}
