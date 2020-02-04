layui.use(['jquery','layer','table','form','laydate'],function () {
    var $ = layui.jquery,
        layer = layui.layer,
        table = layui.table,
        form = layui.form,
        laydate = layui.laydate;

    var jsonEmpPramas = {};  //查询的条件参数

    var currentPage = 1;  //当前页

    //数据的初始化
    loadPageEmpByPramas(jsonEmpPramas);

    //分页加载员工数据
    function loadPageEmpByPramas(jsonEmpPramas) {
        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 512
            ,width:1600
            ,url: 'emp/loadPageEmpByPramas' //数据接口
            ,where:jsonEmpPramas
            ,limit:3
            ,limits:[2,3,5,8,10,15,20]
            ,even:true
            ,page: true //开启分页
            ,cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}
                ,{field: 'empno',align:'center', title: 'ID', width:120, sort: true}
                ,{field: 'ename', title: '姓名', width:150,align:'center'}
                ,{field: 'job', title: '工作', width:150, sort: true,align:'center'}
                ,{field: 'mgr', title: '上司编号', width:120,align:'center'}
                ,{field: 'sal', title: '工资', width: 150,align:'center'}
                ,{field: 'hiredate', title: '入职时间', width: 260, sort: true,align:'center'}
                ,{field: 'comm', title: '奖金', width: 150, sort: true,align:'center'}
                ,{field: 'dname', title: '部门名称', width: 150,align:'center',templet: '<div>{{d.dept.dname}}</div>'}
                ,{field: 'loc', title: '地址', width: 150, sort: true,align:'center',templet: '<div>{{d.dept.loc}}</div>'}
                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
             ]]
        });
    }

    //监听工具条
    table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）

        if(layEvent === 'del'){ //删除
            layer.confirm('真的删除行么', function(index){
                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
            });
        } else if(layEvent === 'edit'){ //编辑
            //do something
            layer.open({
                type:1,
                title:'员工修改界面',
                area:['500px','600px'],
                shade:0.5,
                anim:4,
                content:$("#updEmpDiv")
            });
           /* //同步更新缓存对应的值
            obj.update({
                username: '123'
                ,title: 'xxx'
            });*/
        }
    });

});



