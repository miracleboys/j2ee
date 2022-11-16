<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
        请求报文实体类型：${contentType}<hr>
        数据分割字符串：${boundary}<hr>
        请求报文实体长度(byte)：${contentLength}<hr>
        原始数据（转String后）：
        <pre>
${entity}
        </pre>
        <hr>
        multipart数量：${fn:length(subEntities)}个<hr>
        <ul>
        <c:forEach var="subEntity" items="${subEntities}" varStatus = "status">                      
            <li>multipart${status.index}原数据：<pre>${subEntity}</pre></li>                
        </c:forEach>  
        </ul>
        <ul>
        <c:forEach var="subEntityParsedItem" items="${subEntitiesParsed}" varStatus = "status">
                <br/><hr>
                multipart${status.index}解析后数据：${subEntityParsedItem}<br/>         
                <c:forEach var="value" items="${subEntityParsedItem}" varStatus = "valueStatus"> 
                <br/>             
                <li>参数名${valueStatus.index}：${value.key}</li>   
                <li>参数值${valueStatus.index}：<pre>${value.value}</pre></li>
                <li>参数值${valueStatus.index}长度：(字符数)：${fn:length(value.value)}</li>
                </c:forEach>
        </c:forEach>
        <ul>
    </body>
</html>