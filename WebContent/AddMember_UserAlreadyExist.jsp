<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IAdd Member</title>
</head>
<body>
<form action="Add_Member" method="get" >
<input type="text" placeholder="User Name" name="userName" >
<font color="red" >UserAlready Exist.</font>
<input type="password" placeholder="Password" name="password" >
<input type="text" placeholder="Phone No." name="phoneNo" >
<input type="text" placeholder="Authorization" name="authorization" >
<input type="password" placeholder="Admin Password" name="adminPassword" >

<input type="submit" value="Add" >
</form>
</body>
</html>