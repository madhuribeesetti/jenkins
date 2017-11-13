<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CustomerPage</title>
<style>
a:link, a:visited {
    background-color: #f44336;
    color: white;
    padding: 14px 25px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
}
a:hover, a:active {
    background-color: red;
}
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
label{
width: 100px;
display:block;
}
</style>

</head>
<body align="center">
<a href="index.jsp">HOME</a>


<div>
<h1> Customer Entry Form </h1>
<form action="CreateCustomer" method="post">
<table align="center">
	<tr>
		<td>CustomerId</td>
		<td><input type="text" name="custid" id="custid" placeholder="Enter CustomerID" required></td>
	</tr><br>
	<tr>
		<td>CustomerName</td>
		<td><input type="text" name="cname" id="cname" placeholder="Enter Customer name" required></td>
	</tr><br>
	<tr>
		<td>AccountType</td>
		<td><select id="atype" name="atype">
     		 	<option value="savings">Savings</option>
     		 	<option value="Current">Current</option>
    			</select></td>
    			
	<tr><br>
		<td>Amount</td>
		<td><input type="text" name="amount" id="amount"placeholder="Enter Amount here" required></td>
	</tr><br>
	<tr>
		<td>Date</td>
		<td><input type="text" name="date" id="date" placeholder="Enter date here yyyymmdd" required></td>
	</tr><br>
	<tr><td colspan="2"><input type="submit" value="Submit"></td></tr>

</table>
</form>
</div>
</body>
</html>