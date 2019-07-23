<%-- 
    Document   : home
    Created on : Feb 26, 2019, 1:44:02 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Security Custom Login Form</title>
    </head>
    <body>
        <h1>Company Home Page - Yohoo!!!</h1>
        
        <hr/>
        <!-- display user name and role -->
        <p>
            User: <security:authentication property="principal.username" /><br/><br/>
            Role(s): <security:authentication property="principal.authorities" />
        </p>
        <hr/>
        
        <security:authorize access="hasRole('MANAGER')">
            <!-- add a link to point to /leaders ... this is for manager -->
            <a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a> (Only for Manager peeps)
            <hr/>
        </security:authorize>
        
        <security:authorize access="hasRole('ADMIN')">
            <!-- add a link to point to /leaders ... this is for manager -->
            <a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a> (Only for Admin peeps)
            <hr/>
        </security:authorize>
        
        <h2>Welcome To Company Home Page!</h2>
        
        <form:form action="${pageContext.request.contextPath}/logout" method="POST">
            <input type="submit" value="Logout" />
        </form:form>
    </body>
</html>
