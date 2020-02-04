package com.hyl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyl.entity.Emp;
import com.hyl.mapper.EmpMapper;
import com.hyl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 韩宇龙
 * @create 2020-02-01 13:31
 */
@Service
@Transactional(readOnly = false)
public class EmpServiceImpl implements EmpService {
    //依赖注入员工Mapper代理对象
    @Autowired
    private EmpMapper empMapper;

    //查询所有员工及其部门数据
    @Override
    public List<Emp> findAllEmpAndSelDept() throws Exception {
        return empMapper.selAllEmpAndSelDept();
    }

    //进行分页查询(条件)
    @Override
    public Map<String,Object> findPageEmpAndSelDept(Integer page, Integer limit, Emp emp) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        PageHelper.startPage(page,limit);
        PageInfo<Emp> pageInfo = new PageInfo<Emp>(empMapper.selEmpAndSelDeptByPramas(emp));
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    //根据员工编号删除员工数据
    @Override
    public String removeEmpByEmpno(Integer empno) throws Exception {
        if(empMapper.delEmpByEmpno(empno)>0){
            return "success";
        }else {
            return "fail";
        }
    }

    //根据员工编号查询单个员工数据
    @Override
    public Emp findEmpByEmpno(Integer empno) throws Exception {
        return empMapper.selEmpByEmpno(empno);
    }

    //修改员工数据
    @Override
    public String updEmp(Emp emp) throws Exception {
        if(empMapper.updEmp(emp)>0){
            return "success";
        }else {
            return "fail";
        }
    }

    //添加员工数据
    @Override
    public String saveEmp(Emp emp) throws Exception {
        if(empMapper.insEmp(emp)>0){
            return "success";
        }else {
            return "fail";
        }
    }
}
