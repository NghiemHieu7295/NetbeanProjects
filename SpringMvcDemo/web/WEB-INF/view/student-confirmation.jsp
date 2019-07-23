<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Student Confirmation</title>
    </head>
    <body>
        <p>The student is confirmed: ${student.firstName} ${student.lastName}</p>
        <p>Country: ${student.country}</p>
        <p>Favorite Language: ${student.favoriteLanguage}</p>
        <p>Operating Systems:</p>
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>
    </body>
</html>

