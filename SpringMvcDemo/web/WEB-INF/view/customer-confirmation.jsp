<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Customer Confirmation</title>
    </head>
    <body>
        <p>The customer is confirmed: ${customer.firstName} ${customer.lastName}</p>
        <p>Free Passes: ${customer.freePasses}</p>
        <p>Postal Code: ${customer.postalCode}</p>
        <p>Course Code: ${customer.courseCode}</p>
    </body>
</html>
