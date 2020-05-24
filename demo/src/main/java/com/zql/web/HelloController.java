package com.zql.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @author zhangqianlin
 * @create 2020-04-09 20:47
 */
@Controller
public class HelloController {


    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,springboot";
    }
}
