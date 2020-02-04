package com.hyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *   页面跳转的控制器
 */
@Controller
@RequestMapping("/model")
public class ModelController {

    //跳转到员工显示页面
    @RequestMapping("/toShowEmp")
    public String toShowEmp(){
        return "showEmp";
    }
}
