package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/3/10 21:27
 */
@Controller
public class helloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    @RequestMapping("/answer")
    public String sayAnswer(){
        return "answer";
    }
}
