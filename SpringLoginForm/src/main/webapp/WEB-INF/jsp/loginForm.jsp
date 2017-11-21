<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<h2 textalign="center">Welcome to login page</h2>
	<form:form method="post" action="save1">
		<table>

			<td>Email :</td>
			<td><form:input path="Email" type="email" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="password" type="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>