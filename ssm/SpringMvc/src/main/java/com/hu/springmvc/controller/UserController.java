package com.hu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String a(){
        System.out.println(1111);
        return "1.jsp";
    }
}
