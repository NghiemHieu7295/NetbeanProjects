<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h1>Scope: Prototype</h1>
        <p>-----------------</p>
        <p>tennisCoach1 and tennisCoach2 are same? ${coach1 == coach2}</p>
        <p>Memory location of tennisCoach1 is: ${coach1}</p>
        <p>Memory location of tennisCoach2 is: ${coach2}</p>
    </body>
</html>
