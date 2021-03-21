<%--
  Created by IntelliJ IDEA.
  User: 75230
  Date: 2021/3/21
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">显示结果</h1>
<table align="center" width="60" border="1">
    <tr>
        <th>IP</th>
        <th>times</th>
    </tr>
<c:forEach items="${applicationScope.Map}" var="entry">
    <tr>
        <td>
            ${entry.key}
        </td>
        <td>
            ${entry.value}
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
