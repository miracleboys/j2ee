<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
       <script>
      var baseUrl = "${basePath}/users/";
      function saveSubmit(action){
          dataForm.action = baseUrl+action;
          dataForm.submit();
      }
      </script>
    </head>

    <body>

      <div class="container">
      <h1 id="web_name">绿野房源网</h1>
     
      <form:form name="dataForm" class="login-form" method="post" modelAttribute="user" action="${basePath}/users/add">
        <h2>用户注册</h2>
        登录名称：<form:input type="text" placeholder="用户名称"  path="username" class="ins"/>
        <br>
        用户昵称：<form:input type="text" placeholder="用户昵称" path="caption" class="ins"/>
        <br>
        登录密码：<form:input type="password" placeholder="密码" path="password" class="ins"/>
        <br>
        密码确认：<form:input type="password" placeholder="密码确认" path="rpassword" class="ins"/>
        <br>
        联系方式：<form:input type="text" placeholder="联系方式" path="telephone" class="ins"/>
        <br>
        <input type="submit" value="sss">
        <button onclick="saveSubmit('add')">注册</button>
        <button><a href="${basePath}/users/signIn" target="_blank">返回</a></button>
        <br>
        <span class="message">反馈信息</span>
        <span class="message_${result.code}">${result.msg}</span>
      </form:form>
    </div>

   
      </div>


      </div>

      <script src="${basePath}/js/main.js"></script>
     
    </body>

    </html>