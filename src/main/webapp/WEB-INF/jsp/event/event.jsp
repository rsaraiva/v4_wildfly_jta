<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Events</title>
    </head>
    <body>
        <h1>Events</h1>
        <table>
            <c:forEach items="${events}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.description}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
