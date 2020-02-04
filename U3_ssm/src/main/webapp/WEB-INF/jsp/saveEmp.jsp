<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--http://localhost:8080/-->
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
    <!--引用基础路径-->
    <base href="<%=basePath%>"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工添加页面</title>
</head>
<body>
    <div align="center">
        <h1>员工添加页面</h1>
        <form action="" id="saveForm">
            <table align="center" width="400px" height="380px" cellpadding="0" border="1px">
                <tr>
                    <td>姓名</td>
                    <td><input type="text" name="ename"/></td>
                </tr>
                <tr>
                    <td>工作</td>
                    <td><input type="text" name="job"/></td>
                </tr>
                <tr>
                    <td>上司编号</td>
                    <td><input type="text" name="mgr"/></td>
                </tr>
                <tr>
                    <td>工资</td>
                    <td><input type="text" name="sal"/></td>
                </tr>
                <tr>
                    <td>奖金</td>
                    <td><input type="text" name="comm"/></td>
                </tr>
                <tr>
                    <td>部门</td>
                    <td>
                        <select name="deptno" id="saveSelDept"></select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <button type="button" id="saveBtn">添加</button>
                        <button type="reset" >重置</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>