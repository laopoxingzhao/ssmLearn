package com.hu.springmvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hu.springmvc.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
//@RequestMapping("/s")
public class UserController {
    /**
     * @RequestMapping 请求映射
     * value = "/user",url路径
     * method = RequestMethod.GET,访问方式,只能这
     * params = {"name"},必须带的参数名
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET, params = {"name"})
    public String a(){

        System.out.println(1111);
        return "/1";
    }
    @RequestMapping("user1")
    public ModelAndView a1(){
        /*
        mode 模型 ->封装数据
        view 视图->展示数据
         */
        ModelAndView mv = new ModelAndView();
        /*设置数据*/
        mv.addObject("username","lll");
        /*设置视图名称*/
        mv.setViewName("/hu");
        System.out.println(18);
        return mv;
    }
    @RequestMapping("user2")//Springmvc会将需要的参数注入
    public ModelAndView a2(ModelAndView mv){
        mv.addObject("username","顶顶顶");
        mv.setViewName("/hu");
        return mv;
    }
    @RequestMapping("user3")//Springmvc会将需要的参数注入
    public String a3(Model mv){
        mv.addAttribute("username",111);
        return "/hu";
    }

    @RequestMapping("user4")//Springmvc会将需要的参数注入
    public String a4(HttpServletRequest mv){
        mv.setAttribute("username",2+"达到顶峰");
        return "/hu";
    }
    @RequestMapping("user5")
    @ResponseBody//直接作为响应体,不进行页面跳转
    public String a5( ){

        return "{hu:1,hus:\"aaa\"}";
    }
    @RequestMapping("user6")
    @ResponseBody//直接作为响应体,不进行页面跳转
    public String a6( ) throws IOException {
        user u = new user("hu");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(u);
        return s;
    }
}
