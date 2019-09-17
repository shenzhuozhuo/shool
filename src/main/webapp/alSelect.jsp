<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
        <table border="1px" cellpadding="0px" cellspacing="0px" width="60%" height="30%">
            <tr>
                <td>讲师名称</td>
                <td>讲师年龄</td>
                <td>讲师班级</td>
            </tr>
            <c:forEach var="al" items="${al}">
                <tr>
                    <td>${al.aname}</td>
                    <td>${al.age}</td>
                    <td>
                       <%-- <c:forEach items="${al.ac}" var="c">
                            ${c.aClass.classnname}
                        </c:forEach>--%>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
