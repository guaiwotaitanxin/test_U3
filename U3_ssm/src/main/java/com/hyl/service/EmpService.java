package com.hyl.service;

import com.hyl.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * @author 韩宇龙
 * @create 2020-02-01 13:31
 * 员工表
 */
public interface EmpService {

    //查询所有员工及其部门数据
    List<Emp> findAllEmpAndSelDept() throws Exception;

    //进行分页查询(条件)
    Map<String,Object> findPageEmpAndSelDept(Integer page, Integer limit, Emp emp) throws Exception;

    //根据员工编号删除员工数据
    String removeEmpByEmpno(Integer empno) throws Exception;

    //根据员工编号查询单个员工数据
    Emp findEmpByEmpno(Integer empno) throws Exception;

    //修改员工数据
    String updEmp(Emp emp) throws Exception;

    //添加员工数据
    String saveEmp(Emp emp) throws Exception;


}
