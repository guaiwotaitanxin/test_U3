package com.hyl.entity;

import java.util.Date;

/**
 * @author 韩宇龙
 * @create 2020-02-01 9:24
 * 员工实体对象
 */
public class Emp {
    //编号
    private Integer enpno;
    //姓名
    private String ename;
    //职位
    private String job;
    //上司编号
    private Integer mgr ;
    //入职日期
    private Date hiredate ;
    //工资
    private Double sal ;
    //奖金
    private Double comm ;
    //部门id
    private Integer deptno;

    @Override
    public String toString() {
        return "Emp{" +
                "enpno=" + enpno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }

    public Integer getEnpno() {
        return enpno;
    }

    public void setEnpno(Integer enpno) {
        this.enpno = enpno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
