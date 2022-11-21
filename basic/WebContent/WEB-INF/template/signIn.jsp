<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="scheme" value="${pageContext.request.scheme}" />
<c:set var="serverName" value="${pageContext.request.serverName}" />
<c:set var="serverPort" value="${pageContext.request.serverPort}" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set
  var="basePath"
  value="${scheme}://${serverName}:${serverPort}${contextPath}"
/>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>账号登录</title>
    <link rel="icon" href="${basePath}/images/logo.ico" type="image/x-ico">
    <link rel="stylesheet" type="text/css" href="${basePath}/css/signIn.css">
  </head>
  <body>

  <div class="container">

 
    <form action="#" class="login-form">
      <h2>用户登录</h2>
      登录名称：<input type="text" placeholder="用户名称" path="sss">
      <br>
      登录密码：<input type="password" placeholder="密码" id="pwd">
      <img src="${basePath}/images/close.png" id="eye" onclick="watch()">
      <br>
      <button><a href="${basePath}/users/signUp" target="_blank">注册</a></button>
      <button type="submit">登录</button>
      <br>
      <span class="message">反馈信息</span>
      <span class="message_${result.code}">${result.msg}</span>
    </form>


    </div>


  </div>

 
   <script src="${basePath}/js/main.js"></script>
  </body>
</html>
