<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <c:set var="scheme" value="${pageContext.request.scheme}" />
      <c:set var="serverName" value="${pageContext.request.serverName}" />
      <c:set var="serverPort" value="${pageContext.request.serverPort}" />
      <c:set var="contextPath" value="${pageContext.request.contextPath}" />
      <c:set var="basePath" value="${scheme}://${serverName}:${serverPort}${contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
            <span>消息查询</span>
      </div>
</body>
</html>