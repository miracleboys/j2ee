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
</head>
<body>
    <form:form name="dataForm" modelAttribute="userView" method="post" action="${basePath}/user/listView">        
        用户实名：<form:input path="caption" value=""/>
        <input type="submit" value="查询"/>
    </form:form>
    <table>
        <tr>
            <th>ID</th>
            <th>用户登录名</th>
            <th>用户昵称</th>
            <th>用户密码</th>
            <th>用户组代码</th>
            <th>用户组名称</th>
        </tr>
        <c:forEach var="userView" items="${result.data}">
            <tr>
                <td>${userView.id}</td>
                <td>${userView.username}</td>
                <td>${userView.caption}</td>
                <td>${userView.password}</td>               
                <td>${userView.roleCode}</td>
                <td>${userView.roleCaption}</td>
            </tr>
        </c:forEach>
    </table>
    <span class="message">反馈信息</span>
    <span class="message_${result.code}">${result.msg}</span>
</body>
</html>