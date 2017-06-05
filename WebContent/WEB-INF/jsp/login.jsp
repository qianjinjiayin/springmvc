<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<div style="text-align: center">
	Welcome to login <c:if test="${loginuser eq 'N/A'}">hahahahaha</c:if>, current date time is ${currentDateTime}
	</div>
	<div>
		<form action="<%= request.getContextPath() + "/login/do"%>" method="post">
			<table border="1" align="center">
				<tr>
					<td colspan="2" style="text-align: center">UserLogin</Td>
				</tr>
				<tr>
					<td>UserName：</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password：</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<div style="text-align: center;">
				<input type="submit" value="Login"> <input type="reset"
					value="Reset">
			</div>
		</form>
	</div>

</body>
</html>