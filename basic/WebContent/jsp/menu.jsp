<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                <meta charset="UTF-8" />
                <title>绿野房源网</title>
                    <link rel="icon" href="${basePath}/images/logo.ico" type="image/x-ico">
                    <style>
                        body {
                            background-color: rgba(0, 0, 0,0.5);
                        }
                        button{
                            width: 120px;
                            height: 40px;
                            margin-bottom: 20px;
                        }
                    </style>
                    <script src="${basePath}/js/main.js"></script>
                   
            </head>

            <body>
            	<div id="container">
            	<!-- 用户权限caption传参 -->
            	<c:set var="caption" value="${04}" />
    <c:choose>
        <c:when test="${caption == 01}">
        	<button onclick="find()">消息查询</button>
            <button>信息发布</button>
            <button  onclick="infor()">个人信息 </button>
            <button>安全退出</button>
        </c:when>
        <c:when test="${caption == 02}">
        <button>用户管理</button>
            <button>信息管理</button>
            <button onclick="infor()">个人信息</button>
            <button>安全退出</button>
        </c:when>
        <c:when test="${caption == 03}">
        <button>用户权限</button>
            <button>系统表管理</button>
            <button onclick="infor()">个人信息</button>
            <button>安全退出</button>
        </c:when>
        <c:otherwise>
        <button  onclick="find()" >消息查询</button>
            <button>信息发布</button>
             <button>用户管理</button>
            <button>信息管理</button>
             <button>用户权限</button>
            <button>系统表管理</button>
            <button onclick="infor()">个人信息</button>
            <button>安全退出</button>
            </c:otherwise>
    </c:choose>
            	</div>
               
            </body>

            </html>