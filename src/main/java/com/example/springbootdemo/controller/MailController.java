package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.Result;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public Result SendMail(String email){
        userService.send(email);
        return Result.success();
    }
}
