package com.lanou3g.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {

//    阿斯达

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
