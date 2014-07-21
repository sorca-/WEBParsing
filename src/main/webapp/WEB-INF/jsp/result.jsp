<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Devices List</title>
</head>
<body>
<table rules="all">
    <c:forEach var="device" items="${devicesList}" >
    <tr> <td>${device}</td> </tr>
    </c:forEach>
</table>
</body>
</html>
