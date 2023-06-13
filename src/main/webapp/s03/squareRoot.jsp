<%-- 
    Square Root Calculator
 --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>Square Root Calculator</title>
<link rel="icon" href="https://www.z-table.com/uploads/2/1/7/9/21795380/published/roots-calc.jpeg">
<link rel="stylesheet" href="/jeep/css/squareRoot.css">
</head>

<body>
	<c:choose>
        <c:when test="${not empty result}">
            <p>The square root of ${param.number} is: ${result}</p>
        </c:when>
        <c:when test="${not empty message}">
            <p>${message}</p>
        </c:when>
    </c:choose>
</body>
</html>