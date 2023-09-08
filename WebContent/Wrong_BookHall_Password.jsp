<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BanquetHall Booking</title>
</head>
<body>
<form action="Book_BanquetHall" method="get" >
<input type="text" placeholder="Enter date..." name="date" >
<input type="text" placeholder="Enter Time(24 format)..." name="time" >
<input type="text" placeholder="Enter duration..." name="duration" >
<input type="password" placeholder="Password" name="password" >
<font color="red" >Invalid Password.</font>
<input type="submit" value="Book" >
</form>
</body>
</html>