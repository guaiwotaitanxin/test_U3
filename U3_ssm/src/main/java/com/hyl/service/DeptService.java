package com.hyl.service;

import com.hyl.entity.Dept;

import java.util.List;

/**
 * @author 韩宇龙
 * @create 2020-02-01 13:30
 */
public interface DeptService {

    //查询所有部门数据
    List<Dept> findAllDept() throws Exception;

}
