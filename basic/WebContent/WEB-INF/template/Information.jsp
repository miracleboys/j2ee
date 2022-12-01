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
<style>
      body{
            width: 90%;
            height: 100%;
            background-image: url(${basePath}/images/bg2.jpg);
            background-size: cover;
            background-repeat: no-repeat;
      }
      #table{
            
      }
      span{
            font-size: large;
            color: aqua;
      }
</style>
</head>

	<div id="container">
            <div id="table">
                  <span>个人信息</span>
            </div>
            <div>
                 <form:form name="dataForm" class="login-form" method="post" modelAttribute="user" action="#">
        <h2>用户注册</h2>
        登录名称：<form:input type="text" placeholder="登录名称"  path="username" class="ins"/>
        <br>
        用户昵称：<form:input type="text" placeholder="用户昵称" path="caption" class="ins"/>
        <br>
        登录密码：<form:input type="password" placeholder="密码" path="password" class="ins"/>
        <br>
        密码确认：<form:input type="password" placeholder="密码确认" path="rpassword" class="ins"/>
        <br>
        联系方式：<form:input type="text" placeholder="联系方式" path="telephone" class="ins"/>
        <br>
        <span class="message">反馈信息</span>
        <span class="message_${result.code} message_in">${result.msg}</span>
      </form:form>
            </div>
            <div>
                  <button>修改</button>

            </div>

      </div>

</html>