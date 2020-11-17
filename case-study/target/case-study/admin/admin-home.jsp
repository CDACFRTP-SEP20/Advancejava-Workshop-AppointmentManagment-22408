<%@include file="admin-header.jsp"%>
	welcome
	<%=request.getRemoteUser()%>
	<br>
	<a href="<%=request.getContextPath()%>/AdminController/listuser">User
		management</a>
	<br>
	<a href="<%=request.getContextPath()%>/logout.jsp">Logout</a>
<%@include file="admin-footer.jsp"%>