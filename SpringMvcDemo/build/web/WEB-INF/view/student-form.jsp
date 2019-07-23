<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Student Registration Form</title>
    </head>
    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName" />
            <br><br>
            Last name: <form:input path="lastName" />
            <br><br>
            Country:
            <form:select path="country">
                <!-- form:option value="" label="" -->
                <form:options items="${student.countryOptions}" />
            </form:select>
            <br><br>
            Favorite Language
            <br><br>
            <!-- form:radiobutton path="favoriteLanguage" value="" -->
            <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
            <br><br>
            Operating Systems:
            <form:checkbox path="operatingSystems" value="Linux" /> Linux
            <form:checkbox path="operatingSystems" value="Mac OS" /> Mac OS
            <form:checkbox path="operatingSystems" value="MS Windows" /> MS Windows
            <br><br>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
