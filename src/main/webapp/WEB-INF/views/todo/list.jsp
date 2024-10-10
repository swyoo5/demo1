<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 10. 10.
  Time: 오후 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Page</h2>
<a href="/todo/register">register</a>
<h2>title : ${todoDTO.title}</h2>
<h2>title : ${todoDTO.writer}</h2>
<h2>title : ${todoDTO.dueDate}</h2>
<h2>title : ${todoDTO.finished}</h2>
</body>
</html>
