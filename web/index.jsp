<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/5
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>商品管理系统</title>
  </head>
  <body>
  <h1>商品管理系统</h1>
  <table border="1" width="100%">
    <tr>
      <th colspan="9">
        <form action="goodsgetByTerm" method="post">
          商品名：<input type="text" name="goods.gname" />
          生产日期：<input type="date" name="firstTime"/>-<input type="date" name="lastTime" />
          <input type="submit" value="查询" />
        </form>
      </th>
    </tr>
    <tr>
        <th>全选<input type="checkbox" onclick="" name="checkAll" /></th>
        <th>编号</th>
        <th>物资名称</th>
        <th>类型</th>
        <th>数量（件）</th>
        <th>生产商</th>
        <th>生产日期</th>
        <th>入库日期</th>
        <th>操作</th>
    </tr>
    <s:iterator value="#goods" var="g">
        <tr>
            <td><input type="checkbox" name="check" value="<s:property value="#g.Gno"/>" /></td>
            <td><s:property value="#g.Gno"/> </td>
            <td><s:property value="#g.gname"/> </td>
            <td><s:property value="#g.gtype"/> </td>
            <td><s:property value="#g.Gnumber"/> </td>
            <td><s:property value="#g.Gcompany"/> </td>
            <td><s:property value="#g.Gcreatetime"/> </td>
            <td><s:property value="#g.Uintime"/> </td>
            <td><a href="goodsedit?goods.Gno=<s:property value="#g.Gno" />">修改</a> | <a href="goodsdelete?goods.Gno=<s:property value="#g.Gno" />">删除</a></td>
        </tr>
    </s:iterator>
    <tr>
         <th colspan="9">
             <input type="button" id="deleteAll" value="批量删除" />
         </th>
    </tr>
  </table>
  <a href="add.jsp">增加商品</a>

  <script type="text/javascript" src="jquery-1.12.4.js"></script>
  <script>
      $(function(){
          //全选、反选
          $('input[name="checkAll"]').click(function(){
              if($(this).is(':checked')){
                  $('input[name="check"]').each(function () {
                      $(this).prop("checked",true);
                  });
              } else {
                  $('input[name="check"]').each(function () {
                      $(this).prop("checked",false);
                  });
              }
          });

          //批量删除
          $("#deleteAll").click(function(){
              var Gnos = new Array();
              $("input[name='check']:checked").each(function() {
                  Gnos.push($(this).val());
              });
              if(Gnos.length==0){
                  alert("没有选中");
                  return;
              }
              $.ajax({
                  url:'/goodsdeleteAll',
                  type:'post',
                  data:{'Gnos':Gnos.toString()},
                  success:function (data) {
                      window.location.reload();
                  }
              });
          });

      });

  </script>
  </body>
</html>
