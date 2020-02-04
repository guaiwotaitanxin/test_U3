package com.hyl.service.impl;

import com.hyl.entity.Dept;
import com.hyl.mapper.DeptMapper;
import com.hyl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 韩宇龙
 * @create 2020-02-01 13:30
 */
@Service
@Transactional(readOnly = false)
public class DeptServiceImpl implements DeptService {

    //依赖注入部门Mapper代理对象
    @Autowired
    private DeptMapper deptMapper;

    //查询所有部门数据
    @Override
    public List<Dept> findAllDept() throws Exception {
        return deptMapper.selAllDept();
    }
}
