<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h2>Scope: Singleton (Default)</h2>
        <p>---------------------------</p>
        <p>cricketCoach1 and cricketCoach2 are same? ${coach1 == coach2}</p>
        <p>Memory location of cricketCoach1 is: ${coach1}</p>
        <p>Memory location of cricketCoach2 is: ${coach2}</p>
    </body>
</html>
