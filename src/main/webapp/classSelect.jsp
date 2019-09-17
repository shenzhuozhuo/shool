<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            $(".deletes").click(function () {
                var id = $(".deletes").attr("aid");
                var a = confirm("是否删除这条数据？");
                $.ajax({
                    url: "/shool/ac/deleteAc",
                    type: "post",
                    dataType: "json",
                    data: {"id": id},
                    success: function (data) {
                        if (data == 1) {
                            alert("删除成功")
                            window.location.href = "/shool/ac/acSelect";
                        } else {
                            alert("删除失败")
                            window.location.href = "/shool/ac/acSelect"
                        };
                    },
                });
            })
        })
    </script>
</head>
    <body>
        <table border="1px" cellpadding="0px" cellspacing="0px" width="60%" height="30%">
            <tr>
                <td>学校名称</td>
                <td>学校位置</td>
                <td>讲师</td>
                <td>年龄</td>
                <td>性别</td>
                <td>学生</td>
                <td>分配讲师</td>
                <td>分配教室</td>
                <td>选择学生</td>
                <td>删除</td>
            </tr>
            <c:forEach items="${acs}" var="acs" >
                <tr>
                <td>${acs.classnname}</td>
                <td>${acs.ac.classroom.location}</td>
                <td>${acs.ac.alecturer.aname}</td>
                <td>${acs.ac.alecturer.age}</td>
                    <c:choose>
                        <c:when test="${acs.ac.alecturer.sex == 1}">
                            <td>男</td>
                        </c:when>
                        <c:when test="${acs.ac.alecturer.sex == 0}">
                            <td>女</td>
                        </c:when>
                        <c:when test="${acs.ac.alecturer.sex == null}">
                            <td></td>
                        </c:when>
                    </c:choose>
                    <td>
                    <c:forEach var="s" items="${acs.sc}">
                        ${s.students.sname}
                    </c:forEach>
                    </td>
                    <td><a href="/shool/ac/selectAle?cid=${acs.cid}">分配讲师</a></td>
                    <td><a href="/shool/ac/selectClas">分配教室</a></td>
                    <td><a href="/shool/ac/selectStu?cid=${acs.cid}">选择学生</a></td>
                    <td><a class="deletes" href="javascript:;" aid=${acs.cid}>删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
