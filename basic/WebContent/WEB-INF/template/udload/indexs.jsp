<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>文件上传</title>
</head>
<body>
    <form action="${basePath}/lesson/uploadSingle" method="post" enctype="multipart/form-data" target="_blank">
        学号：<input name="studentCode" value="0000007"/><br/>
        文件1：<input name="file1" type="file"/><br/>    
        <input type="submit"/>
    </form>
</body>
</html>