<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加教室</title>
</head>
    <body>
        <table border="1px" cellpadding="0px" cellspacing="0px" width="20%" height="30%">
            <tr>
                <td>教室</td>
                <td>操作</td>
            </tr>
            <c:forEach var="cla" items="${cla}">
                <tr>
                    <td>${cla.location}</td>
                    <td><a href="">选择教室</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
