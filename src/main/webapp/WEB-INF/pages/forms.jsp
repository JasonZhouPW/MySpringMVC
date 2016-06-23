<%--
  Created by IntelliJ IDEA.
  User: Zhoupeiwen
  Date: 2016/6/23
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input forms</title>
</head>
<body>

  <form method="post" action="/rest/user/new">
    <p1>id:</p1><input name="id" type="text">
    <p1>name:</p1><input name="name" type="text">
    <button type="submit">submit</button>
  </form>

</body>
</html>
