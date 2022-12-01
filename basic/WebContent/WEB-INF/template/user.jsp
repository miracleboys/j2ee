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
            
                <script src="${basePath}/js/main.js"></script>
               
            </head>

        
            <frameset rows="48px,*" border="0" >
               
                        <frame id="workspace" src="${basePath}/users/signIn" name="frame3"/>
         
            </frameset>
            </html>