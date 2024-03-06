package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;

public interface UserService {

    public User findById(Integer id);
    //根据用户名查询用户
    User findByUserName(String username);

    void register(String username, String password);

    void update(User user);

    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd);

    void send(String email);
}
