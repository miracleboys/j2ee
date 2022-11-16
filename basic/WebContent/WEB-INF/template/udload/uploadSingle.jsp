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
        原始文件名：${originalFilename}<hr>
        服务器保存文件名：${savingFilename}<hr>
        文件大小(byte)：${fileSize}<hr>
        状态码：${resultCode}<hr>
        状态描述：${resultMsg}
    </body>
</html>