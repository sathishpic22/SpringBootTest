<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Login" method=post>
Username : <input type="text" name="text1" ><br>
Password : <input type="text" name="text2" >
<button value="Submit">Submit</button>
<div>${msg}</div><br>
<c:forEach items="${list}" var="student">
    <p>${student}</p>
</c:forEach>
<c:forEach items="${slist}" var="student">
    <p>${student.no}....${student.name}</p>
</c:forEach>
</form>
</body>
</html>