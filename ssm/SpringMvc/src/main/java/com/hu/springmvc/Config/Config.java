package com.hu.springmvc.Config;

import com.hu.springmvc.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hu.springmvc.service")
public class Config {

}
