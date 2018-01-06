package com.lanou3g.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
//我考的风格
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
