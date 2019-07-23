<%-- 
    Document   : index
    Created on : Mar 7, 2019, 10:26:48 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Spring Rest Demo</h1>
        <hr/>
        <a href="${pageContext.request.contextPath}/test/hello">Hello</a><br/><br/>
        <a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
    </body>
</html>
