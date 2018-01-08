package com.lanou3g.order.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class OrderController {




















    /*以下是跳转相关页面的方法,如非特殊变动,勿动*/


    //主页-左侧边栏-交易管理-订单管理 的页面跳转
    @RequestMapping(value = "OrderForm")
    public String OrderForm(){
        return "/order/Orderform";
    }

}
