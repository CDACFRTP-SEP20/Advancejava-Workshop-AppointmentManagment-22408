 <%@include file="admin-header.jsp"%>
	${deletemsg}
	<a href="<%=request.getContextPath()%>/admin/add-user.jsp">add users</a>
	<table border="1">
		<tr>
			<th>Username</th>
			<th>Userrole</th>
		</tr>
		<c:forEach var="user" items="${users }">
			<tr>
			<!-- user.getUsername(); user.getUserrole() -->			
			<td><c:out value="${user.username}"></c:out></td>  
			<td><c:out value="${user.userrole}"></c:out></td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/deleteuser?username=${user.username}">delete</a>
			</td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/edituser?username=${user.username}">update</a>
			</td>
			</tr>
		</c:forEach>		
	</table>
<%@include file="admin-footer.jsp"%>