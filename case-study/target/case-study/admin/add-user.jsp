<%@include file="admin-header.jsp"%>
Adding new user
<form method="post"
	action="<%=request.getContextPath()%>/AdminController/adduser">
	Username: <input type="text" name="username"> <br>
	Password: <input type="password" name="password"> <br>
	Role: <input type="text" name="userrole"> <br> <input
		type="submit" value="Add User">
</form>
<%@include file="admin-footer.jsp"%>