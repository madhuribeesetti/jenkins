<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>

</head>
<body align="center">
<div>
<a href="index.jsp">HOME</a>
<h1>Search Customer</h1>

<form action="SearchCustomer" method="get">
<table align="center">
	<tr>
		<td>CustomerID</td>
		<td><input type="text" name="custid" id="custid" placeholder="ENTER customer Id here" required></td>
	</tr><br>
	<tr>
		<td>Date</td>
		<td><input type="text" name="date" id="date" placeholder="Enter Date YYYYMMDD" required></td>
	</tr><br>
<input type="hidden" name="button" value="actionsearch">

		<tr><td colspan="2"><input type="submit" value="search"></td></tr></table>
</form>
</div>
</body>
</html>