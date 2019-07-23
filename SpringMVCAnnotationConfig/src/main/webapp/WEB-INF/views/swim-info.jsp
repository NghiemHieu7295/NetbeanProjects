<%-- 
    Document   : swim-info
    Created on : Feb 10, 2019, 1:10:04 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h1>Scope: Prototype</h1>
        <p>------------------</p>
        <p>swCoach1 and swCoach2 are same? ${swCoach1 == swCoach2}</p>
        <p>Memory location of swCoach1 is: ${swCoach1}</p>
        <p>Memory location of swCoach2 is: ${swCoach2}</p>
    </body>
</html>
