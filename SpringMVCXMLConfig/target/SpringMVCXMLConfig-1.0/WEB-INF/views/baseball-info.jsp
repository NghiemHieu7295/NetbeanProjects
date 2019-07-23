<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h1>${theCoach.name} ${theCoach.age} ${theCoach.getDailyWorkout()} ${theCoach.getDailyFortune()}</h1>
    </body>
</html>
