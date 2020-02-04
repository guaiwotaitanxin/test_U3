package com.hyl.entity;

/**
 * @author 韩宇龙
 * @create 2020-02-01 9:36
 * 部门实体类对象
 */
public class Dept {
    //部门编号
    private Integer deptno;
    //部门名称
    private String dname;
    //地址
    private String loc;

    @Override
    public String

    toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
