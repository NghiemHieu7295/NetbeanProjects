<%-- 
    Document   : tennis-info
    Created on : Feb 9, 2019, 8:27:05 PM
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
        <h1>Scope: Singleton (Default)</h1>
        <p>----------------------------</p>
        <p>tnCoach1 and tnCoach1 are same? ${tnCoach1 == tnCoach2}</p>
        <p>Memory location of tnCoach1 is: ${tnCoach1}</p>
        <p>Memory location of tnCoach2 is: ${tnCoach2}</p>
    </body>
</html>
