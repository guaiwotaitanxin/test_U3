package com.hyl.mapper;

import com.hyl.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *   员工Mapper代理接口
 */
public interface EmpMapper {

    //查询所有员工数据
    List<Emp> selAllEmp() throws Exception;

    //查询所有员工以及其部门数据(预先抓取)
    List<Emp> selAllEmpAndDept() throws Exception;

    //查询所有员工以及其部门数据(嵌套查询)
    List<Emp> selAllEmpAndSelDept() throws Exception;

    //根据部门编号查询多个员工数据(为了做部门方嵌套查询)
    List<Emp> selEmpsByDeptno(Integer deptno) throws Exception;

    //根据员工编号删除员工数据
    Integer delEmpByEmpno(Integer empno) throws Exception;

    //根据员工编号查询单个员工数据
    Emp selEmpByEmpno(Integer empno) throws Exception;

    //修改员工数据
    Integer updEmp(Emp emp) throws Exception;

    //添加员工数据
    Integer insEmp(Emp emp) throws Exception;

    //根据条件查询员工数据
    List<Emp> selEmpAndSelDeptByPramas(@Param("emp") Emp emp) throws Exception;

}
