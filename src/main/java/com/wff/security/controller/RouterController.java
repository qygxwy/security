package com.wff.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangfangfang
 * @Title:
 * @Description:
 * @date 2020/4/134:31 下午
 * @since 1.8
 */

@Controller
public class RouterController {

    @RequestMapping({"/","index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "views/login";
    }

    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") Integer id){
        return "views/level1/"+id;
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") Integer id){
        return "views/level2/"+id;
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") Integer id){
        return "views/level3/"+id;
    }
}