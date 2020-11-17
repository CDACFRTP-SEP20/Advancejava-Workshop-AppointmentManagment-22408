<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Insert title here</title>
</head>
<body>
	<nav class="nav-bar">
		<a href="<%=request.getContextPath()%>/admin/admin-home.jsp">Admin
				Home</a>
		<a href="<%=request.getContextPath()%>/AdminController/listuser">Users</a>
		<a href="<%=request.getContextPath()%>/logout.jsp">Logout</a>
	</nav>
<hr>