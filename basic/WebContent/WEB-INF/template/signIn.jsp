<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <script >
    var baseUrl = "${basePath}/users/";
    function saveSubmit(action){
        dataForm.action = baseUrl+action;
        dataForm.submit();
    }
    </script>
  </head>
  <body>

  <div class="container">
    <h1 id="web_name">绿 野 房 源 网</h1>
    <form:form name="dataForm" method="post" modelAttribute="user" action="#" class="login-form">
      <h2>用户登录</h2>
      登录名称：<form:input type="text" placeholder="用户名称" path="username" />
      <br>
      登录密码：<form:input type="password" placeholder="密码" path="password" id="pwd" /><span id="eye" style="font-size:25px;position: absolute;top: 130px;right: 30px;" onclick="watch()">&#128515;</span>
      <br>
      <button><a href="${basePath}/users/signUp" target="_blank">注册</a></button>
      <button onclick="saveSubmit('lognIn')">登录</button>
      <br>
      <span class="message">反馈信息</span>
      <span class="message_${result.code} message_in">${result.msg}</span>
    </form:form>


    </div>


  </div>

 
   <script src="${basePath}/js/main.js"></script>
  </body>
</html>
