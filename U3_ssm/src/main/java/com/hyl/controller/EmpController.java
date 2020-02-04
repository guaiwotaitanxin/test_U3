package com.hyl.controller;

import com.hyl.entity.Emp;
import com.hyl.service.DeptService;
import com.hyl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *   员工控制器层
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    //依赖员工业务层对象
    @Autowired
    private EmpService empService;

    //依赖部门业务层对象
    @Autowired
    private DeptService deptService;

    //去到员工显示首页(分页)
    @RequestMapping("/loadPageEmpByPramas")
    public @ResponseBody
    Map<String,Object> loadPageEmpByPramas(@RequestParam(defaultValue = "1") Integer page,
                                           @RequestParam(defaultValue = "3")Integer limit, Emp emp){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            map = empService.findPageEmpAndSelDept(page,limit,emp);
            map.put("code",0);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code",200);
        }
        return map;
    }

    //删除员工
    @RequestMapping("/delEmpByEmpno")
    public @ResponseBody String delEmpByEmpno(Integer empno){
        try {
            return empService.removeEmpByEmpno(empno);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    //修改
    @RequestMapping("/updEmp")
    public @ResponseBody String updEmp(Emp emp){
        try {
            return empService.updEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    //添加
    @RequestMapping("/saveEmp")
    public @ResponseBody String saveEmp(Emp emp){
        emp.setHiredate(new Date());
        try {
            return empService.saveEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
