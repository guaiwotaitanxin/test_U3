<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
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
    <title>标题</title>
    <!--引入layui的样式文件-->
    <link rel="stylesheet" href="lib/layui/css/layui.css">
    <!--引入layui的js文件-->
    <script src="lib/layui/layui.js"></script>
    <style type="text/css">
        .layui-table td{
            height: 50px;
        }
    </style>
</head>
<body>
    <!--关联修改的界面-->
    <jsp:include page="updEmp.jsp"/>
    <!--关联添加的界面-->
    <%--<jsp:include page="saveEmp.jsp"/>--%>
    <!--数据的div-->
    <div align="center">
        <h1>员工数据查询页面</h1>
        <form action="" class="layui-form" style="margin-top: 30px;">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">员工姓名</label>
                    <div class="layui-input-inline">
                        <input type="text" name="ename" lay-verify="required" placeholder="请输入姓名" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">部门</label>
                    <div class="layui-input-inline">
                        <select id="selDept"></select>
                    </div>
                </div>
                <div class="layui-inline">
                    <div class="layui-input-inline">
                        <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                    </div>
                </div>
            </div>
        </form>
        <!--数据表格-->
        <table id="demo" lay-filter="test"></table>
    </div>
</body>
    <script src="js/showEmp.js"></script>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
</html>