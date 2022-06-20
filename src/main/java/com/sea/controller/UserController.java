package com.sea.controller;

import com.sea.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    UserServiceImpl userServiceImpl;


    @RequestMapping("/toUserRegisterPage")
    public String toUserRegisterPage(){
        return "/userRegister";
    }

    @RequestMapping("/toForgetPwdPage")
    public String toForgetPwdPage(){
        return "忘记密码";
    }

    @RequestMapping("/userLogin")
    public String userLogin(String username, String password){
        return "登录成功";
    }
}
