 <%@include file="admin-header.jsp"%>
	Updating user
	<form method="post"
		action="<%=request.getContextPath()%>/AdminController/updateuser">
		Username: <input type="text" name="username" value="${user.username}" readonly="readonly"> <br>
		Password: <input type="password" name="password" value=""> <br>
		Role: <input type="text" name="userrole" value="${user.userrole}"> <br> <input
			type="submit" value="Update User">
	</form>
<%@include file="admin-footer.jsp"%>