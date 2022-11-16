<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<c:set var="scheme" value="${pageContext.request.scheme}"/>
<c:set var="serverName" value="${pageContext.request.serverName}"/>
<c:set var="serverPort" value="${pageContext.request.serverPort}"/>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="basePath" value="${scheme}://${serverName}:${serverPort}${contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${basePath}/css/main.css">
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
<form:form modelAttribute="student" method="post" action="${basePath}/lesson/myUIBySelectSubmit">
    语言选择/Language:<input name="lang" value="${lang}"/><br/>   
    服务器语言环境：${locale.displayCountry}, ${locale}<hr>
    <spring:message code="welcome" arguments="${student.name},${student.code}" argumentSeparator="," text="code无法找到时显示的信息" /><br/>
    <spring:message code="student.code"/>：   <form:input path="code"/>    <form:errors path="code" /><br/>
    <spring:message code="student.name"/>：   <form:input path="name"/>    <form:errors path="name" /><br/>
    <spring:message code="gender" text="code无法找到时显示的信息" />：${student.gender}<br/>        
    <input type="submit"/>
</form:form>
</body>
</html>
