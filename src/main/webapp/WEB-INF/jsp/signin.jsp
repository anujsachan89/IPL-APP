<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
h3{
padding-right:100px;
}
h4{
padding-right:100px;
padding-top:150px; 
}
table
{
padding-right:100px;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3 align="right">Enter the following Information</h3>
<h3>${Message}</h3>
	<form method="post" action="signin">
<table  bgcolor="FloralWhite" cellpadding="5px" cellspacing="5px" align="right">
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" required/>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required />
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="SUBMIT" /></td>
			</tr>
		</table>
       </form>
	<a href="signup"><h4 align="right">New user??Click here to sign up!</h4></a>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
