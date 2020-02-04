package com.hyl.mapper;

import com.hyl.entity.Dept;

import java.util.List;

/**
 *   部门Mapper代理接口
 */
public interface DeptMapper {

    //根据部门编号查询单个部门数据
    Dept selDeptByDeptno(Integer deptno) throws Exception;

    //根据部门编号查询单个部门数据和其下的所有员工数据（预先抓取）
    Dept selDeptAndEmpByDeptno(Integer deptno) throws Exception;

    //据部门编号查询单个部门数据和其下的所有员工数据（嵌套查询；懒加载）
    Dept selDeptAndSelEmpByDeptno(Integer deptno) throws Exception;

    //查询所有部门数据
    List<Dept> selAllDept() throws Exception;

}
