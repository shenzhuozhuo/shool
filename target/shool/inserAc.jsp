<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加信息</title>
</head>
    <body>
        <table border="1px" cellpadding="0px" cellspacing="0px" width="60%" height="30%">
            <tr>
                <td>学生姓名</td>
                <td>学生住址</td>
                <td>学生班级</td>
                <td>选择班级</td>
            </tr>
            <c:forEach items="${stu}" var="stu">
                <tr>
                    <td>${stu.sname}</td>
                    <td>${stu.home}</td>
                    <td>${stu.sc.aClass.classnname}</td>
                    <td><a href="/shool/ac/inserAc?sid=${stu.sid}&cid=${cid}">选择班级</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
