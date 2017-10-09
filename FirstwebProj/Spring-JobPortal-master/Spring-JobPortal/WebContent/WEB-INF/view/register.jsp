<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration | Spring Job Portal</title>
<style type="text/css" scoped>
td {
	text-align: left;
	font-family: verdana, arial;
	color: #064073;
	font-size: 1.00em;
}

input {
	border: 1px solid #CCCCCC;
	border-radius: 5px;
	color: #666666;
	display: inline-block;
	font-size: 1.00em;
	padding: 5px;
	width: 100%;
}

input[type="button"],input[type="reset"],input[type="submit"] {
	height: auto;
	width: auto;
	cursor: pointer;
	box-shadow: 0px 0px 5px #0361A8;
	float: right;
	text-align: right;
	margin-top: 10px;
	margin-left: 7px;
}

table.center {
	margin-left: auto;
	margin-right: auto;
}

.error {
	font-family: verdana, arial;
	color: #D41313;
	font-size: 1.00em;
}
</style>
</head>
<body>
	<div style="text-align: center;">
		<div
			style="box-sizing: border-box; display: inline-block; width: auto; max-width: 480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;">
			<div
				style="background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;">
				<span
					style="font-family: verdana, arial; color: #D4D4D4; font-size: 1.00em; font-weight: bold;">Enter
					Register Form</span>
			</div>
			<div style="background:; padding: 15px"></div>
			<form:form method="post" action="registerSubmit" name="aform" target="_top"
					modelAttribute="registration">
					<table class='center'>
						<tr>
							<td>Name:</td>
							<td><form:input type="text" name="name" path="name"></form:input></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input type="text" name="email" path="email"></form:input></td>
						</tr>
						<tr>
							<td>Age:</td>
							<td><form:input type="text" name="age" path="age"></form:input></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" value="Enter"></td>
						</tr>
					</table>
				</form:form>
		</div>
	</div>
</body>
</html>