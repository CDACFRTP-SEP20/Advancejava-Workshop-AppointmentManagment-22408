<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form
		action="<%=request.getContextPath()%>/AppointmentController/registerappointment">
		Username : <input type="text" name="username"> <br>
		Appointment Date : <input type="text" name="appointmentdate"> <br> 
		Appointment Time :<input type="text" name="appointmenttime"> <br> 
		Description : <input type="text" name="description"/><br>
		Address : <input type="text" name="address"/><br>
		 <input type="submit" value="Register Appointment">

	</form>
</body>
</html>