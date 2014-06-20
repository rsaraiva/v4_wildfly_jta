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
                    <td>${item.formattedDate}</td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <form action="${linkTo[EventController].add}" method="post">
            <span>Description: </span>
            <input type="input" name="event.description"/>
            <span>Date </span>
            <input type="input" name="event.date"/>
            <button>Add</button>
        </form>
    </body>
</html>
