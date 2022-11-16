<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>语言信息</title>
<style>
    ul{
        margin-left:20px;
    }
</style>
</head>
<body>
我创建的语言环境：${locale}<hr>
获取所有已安装的语言环境：<hr>
<c:forEach var="locale" items="${locales}" varStatus="status">
    ${status.index}-${locale}<br>
    <ul>
    <li>locale.getCountry() ---> ${locale.country}</li>
    <li>locale.getDisplayCountry() ---> ${locale.displayCountry}</li>
    <li>locale.getDisplayLanguage() ---> ${locale.displayLanguage}</li>
    <li>locale.getDisplayName() ---> ${locale.displayName}</li>
    <li>locale.getDisplayScript() ---> ${locale.displayScript}</li>
    <li>locale.getDisplayVariant() ---> ${locale.displayVariant}</li>
    <li>locale.getLanguage() ---> ${locale.language}</li>
    <li>locale.getScript() ---> ${locale.script}</li>
    </ul>
    <hr>    
</c:forEach>
</body>
</html>
