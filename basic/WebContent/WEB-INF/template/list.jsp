<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="scheme" value="${pageContext.request.scheme}" />
<c:set var="serverName" value="${pageContext.request.serverName}" />
<c:set var="serverPort" value="${pageContext.request.serverPort}" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="basePath" value="${scheme}://${serverName}:${serverPort}${contextPath}" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${basePath}/css/main.css">
<meta charset="UTF-8">
<title>用户管理</title>
<script>
    var baseUrl = "${basePath}/user/";   
    function loadData(id){
        dataForm.id.value = id;       
        dataForm.action = baseUrl+"list";
        dataForm.submit();
    }
    function saveSubmit(action){
        dataForm.action = baseUrl+action;
        dataForm.submit();
    }
    function deleteData(id){
        if(confirm("是否确实删除本记录？")){
        dataForm.id.value = id;       
        dataForm.action = baseUrl+"delete";
        dataForm.submit();
        }
    }
</script>
</head>
<body>
    <form:form name="dataForm" modelAttribute="user" method="post" action="${basePath}/user/add">
        ID：<form:input path="id" readonly="true"/>
        用户名：<form:input path="username" />
        密码：<form:input path="password" />
        <input type="button" value="更新" onclick="saveSubmit('update')" />
        <input type="button" value="添加" onclick="saveSubmit('add')" />
    </form:form>
    <table>
        <tr>
            <th>ID</th>
            <th>用户名</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
        <c:forEach var="user" items="${result.data}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <button onclick='loadData(${user.id})'>编辑</button>
                    <button onclick='deleteData(${user.id})'>删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <span class="message">反馈信息</span>
    <span class="message_${result.code}">${result.msg}</span>
</body>
</html>