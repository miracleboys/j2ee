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
                            background-color: rgb(103, 222, 44);
                        }
                        /* #container{
                            background-color: rgb(222, 63, 23);
                            width: 100vw;
                            height: 100vh;
                        } */
                        #title{
                            float: left;
                        }
                        #title span{
                            font-size: 25px;
                            font-weight: bolder;
                            font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
                            background: linear-gradient(to right, rgb(186, 23, 23), rgb(8, 8, 166));
                            -webkit-background-clip: text;
                            color: transparent;
                        }

                        #members{
                            float: right;
                        }
                        #menu{
                            float: right;
                        }

                    </style>
            <script src="${basePath}/js/main.js"></script>
            </head>
            
            <body>
                <div id="container">
                	<div id="title">
                	<span>绿野房源网</span>
                	</div>
                    <div id="user">
                        <span>${user.username}</span>
                        <span>${user.caption}</span>
                    </div>
                	<div id="members">
                	<span>小组消息：</span>
                	<span>徐文杰0204363</span>
                	<span>丁鹤翔0204365</span>
                	<span>黄家齐xxxxxxx</span>
                	<span>虞俊杰xxxxxxx</span>
                	</div>
                	
                	<button onclick="open()" id="menu">菜单</button>
                </div>
               
            </body>

            </html>