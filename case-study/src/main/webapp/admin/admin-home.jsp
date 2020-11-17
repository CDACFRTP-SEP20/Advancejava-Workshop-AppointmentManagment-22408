<%@page import="com.cybage.model.Appointment"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment list</title>
</head>
<body>


	<!-- logic for rendering list...  -->
	
	
	<table border="1">
		<tr>
			<th>Username</th>
			<th>AppointmentDate</th>
			<th>AppointmentTime</th>
			<th>Description</th>
			<th>Address</th>
		</tr>
		<c:forEach var="user" items="${apntmnts}">

			<tr>
				<!-- user.getUsername(); user.getUserrole() -->

				<td><c:out value="${user.username}"></c:out></td>
				<td><c:out value="${user.appointmentdate}"></c:out></td>
				<td><c:out value="${user.appointmenttime}"></c:out></td>
				<td><c:out value="${user.description}"></c:out></td>
				<td><c:out value="${user.address}"></c:out></td>
				<td><a
					href="<%=request.getContextPath()%>/AdminController/deletappointment?username1=${user.username}">delete</a>
				</td>
				<td><a
					href="<%=request.getContextPath()%>/AdminController/edithead?username=${user.username}">update</a>
				</td>
			</tr>

		</c:forEach>

	</table>
	<br>
	<a href="<%=request.getContextPath()%>/logout.jsp">Logout</a>
</body>
</html>
