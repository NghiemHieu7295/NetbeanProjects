<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Customer Registration Form</title>
        <style>
            .error{
                color: red;
            }
        </style>
    </head>
    <body>
        <p><i>Fill out the form. Asterisk (*) means required.</i></p>
        
        <form:form action="processForm" modelAttribute="customer">
            
            First Name: <form:input path="firstName" />
            <br><br>
            
            Last Name (*): <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />
            <br><br>
            
            Free Passes: <form:input path="freePasses" />
            <form:errors path="freePasses" cssClass="error" />
            <br><br>
            
            Postal Code: <form:input path="postalCode" />
            <form:errors path="postalCode" cssClass="error" />
            <br><br>
            
            Course Code: <form:input path="courseCode" />
            <form:errors path="courseCode" cssClass="error" />
            <br><br>
            
            <input type="submit" value="Submit">
        </form:form>
            
    </body>
</html>