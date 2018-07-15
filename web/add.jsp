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
    <title>增加商品</title>
</head>
<body>
    <h1>添加商品</h1>
    <form action="goodsadd" method="post">
        <p>
            <label>名称：</label>
            <input type="text" name="goods.gname" />
        </p>
        <p>
            <label>类型：</label>
            <input type="text" name="goods.gtype" />
        </p>
        <p>
            <label>数量：</label>
            <input type="number" name="goods.Gnumber" />
        </p>
        <p>
            <label>生产商：</label>
            <input type="text" name="goods.Gcompany" />
        </p>
        <p>
            <input type="submit" value="提交" />
        </p>
    </form>
</body>
</html>
