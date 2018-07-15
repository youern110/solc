<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/6
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商品</title>
</head>
<body>
    <h1>修改商品</h1>
    <form action="goodsupdate" method="post">
        <p>
            <label>名称：</label>
            <input type="text" value="<s:property value="#goods1.gname"/>" name="goods.gname" />
        </p>
        <p>
            <label>类型：</label>
            <input type="text" value="<s:property value="#goods1.gtype"/>" name="goods.gtype" />
        </p>
        <p>
            <label>数量：</label>
            <input type="text" value="<s:property value="#goods1.Gnumber"/>" name="goods.Gnumber" />
        </p>
        <p>
            <label>生产商：</label>
            <input type="text" value="<s:property value="#goods1.Gcompany"/>" name="goods.Gcompany" />
        </p>
        <p>
            <label>生产日期：</label>
            <input type="date" value="<s:property value="#goods1.Gcreatetime"/>" name="goods.Gcreatetime" />
        </p>
        <p>
            <input type="hidden" value="<s:property value="#goods1.Gno"/>" name="goods.Gno" />
            <input type="hidden" value="<s:property value="#goods1.uintime"/>" name="goods.uintime" />
            <input type="submit" value="提交" />
        </p>
    </form>
</body>
</html>
