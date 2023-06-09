<%-- 
    Introduction to Jakarta Enterprise Edition - JSP
    https://github.com/egalli64/jeep
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<link rel="icon" href="data:;base64,=">
<link rel="stylesheet" href="mood.css">
<title>Hello</title>
</head>

<body class="${param.mood}">
    <h1>Hello!</h1>
     
     <p>Hello ${empty name ? param.name : name}!</p>
     
</body>

</html>