package com.hyl.controller;

import com.hyl.entity.Dept;
import com.hyl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *   部门控制器层
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    //依赖部门业务层对象
    @Autowired
    private DeptService deptService;

    //加载所有部门数据
    @RequestMapping("/loadAllDept")
    public @ResponseBody
    List<Dept> loadAllDept(){
        try {
            return deptService.findAllDept();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
