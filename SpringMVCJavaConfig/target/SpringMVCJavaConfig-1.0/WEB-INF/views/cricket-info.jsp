<%-- 
    Document   : cricket-info
    Created on : Feb 9, 2019, 7:37:25 PM
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
        <h1>${theCoach.name} ${theCoach.age}</h1>
        <h2>${theCoach.getDailyWorkout()} ${theCoach.getDailyFortune()}</h2>
    </body>
</html>
