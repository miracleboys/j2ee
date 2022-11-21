<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
      <title>账号注册</title>
      <link rel="icon" href="${basePath}/images/logo.ico" type="image/x-ico">
      <link rel="stylesheet" type="text/css" href="${basePath}/css/signUp.css">
    </head>

    <body>

      <div class="container">

      
      <form action="#" class="login-form">
        <h2>用户注册</h2>
        登录名称：<input type="text" placeholder="用户名称">
        <br>
        用户昵称：<input type="text" placeholder="用户昵称">
        <br>
        登录密码：<input type="password" placeholder="密码">
        <br>
        密码确认：<input type="text" placeholder="密码确认">
        <br>
        联系方式：<input type="text" placeholder="联系方式">
        <br>
        <button>注册</button>
        <button><a href="${basePath}/users/signIn" target="_blank">返回</a></button>
        <br>
        <span class="message">反馈信息</span>
        <span class="message_${result.code}">${result.msg}</span>
      </form>
    </div>

   
      </div>


      </div>

      <script src="" ${basePath}/js/main.js"></script>
    </body>

    </html>