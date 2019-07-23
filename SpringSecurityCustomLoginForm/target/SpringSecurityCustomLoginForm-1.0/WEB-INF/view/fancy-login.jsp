<%-- 
    Document   : fancy-login
    Created on : Feb 26, 2019, 3:38:41 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Security Custom Login Form</title>
        
        <!-- CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            #errorMess{
                padding: 10px;
                font-style: italic;
                color: red;
                background-color: antiquewhite;
            }
            
            #form-title{
                background-color: lightblue;
                margin: -15px -15px 10px -15px;
                padding: 10px;
                font-weight: 500;
            }
            
            form{
                margin: 100px auto;
                padding: 15px;
                width: 400px;
                background-color: whitesmoke;
                border: 2px solid #9dc7f9;
                border-radius: 4px;
            }
            
            input[type="submit"]{
                background-color: #44a244;
                color: #fff;
                border: none;
                border-radius: 4px;
                padding: 5px 10px;
            }
            
            
        </style>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/processLogin" method="POST">
            
            <p id="form-title">Sign In</p>
            
            <c:if test="${param.error != null}">
                <p id="errorMess">Sorry! You entered invalid username/password</p>
            </c:if>
                
            <c:if test="${param.logout != null}">
                <p class="alert alert-success">You have been logged out.</p>
            </c:if>
            
            <div class="input-group mb-3">
                <div class="input-group-prepend"><i class="input-group-text d-flex fa fa-user"></i></div>
                <input class="form-control" type="text" name="username" placeholder="Username" />
            </div>
                
            <div class="input-group mb-3">
                <div class="input-group-prepend"><i class="input-group-text d-flex fa fa-lock"></i></div>
                <input class="form-control" type="password" name="password" placeholder="Password" />
            </div>
            
            <input type="submit" value="Login" />
            
            <!-- Manually adding tokens. If you don't want to add manually, use form:form tag -->
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
        
        <!-- JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
