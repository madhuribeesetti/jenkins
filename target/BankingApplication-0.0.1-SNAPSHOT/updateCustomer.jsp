<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>userView</title>
<% String Message=(String)request.getAttribute("message");
ResultSet resultset = (ResultSet) request.getAttribute("rs");

if (resultset != null) { 
 
%>
</head>
<body>
<a href="index.jsp">HOME</a>
<center>
<h2>User Details</h2>
<div class="container">

 
 
  <table style="border-collapse: separate;  border-spacing: 10px; padding:2px;" class="table table-striped" >
    <thead>
      <tr>
      <th>User_Id</th>
        <th>User_Name</th>
        <th>Acc_Type</th>
        <th>Amount</th>
        <th>Date</th>
         
      </tr>
    </thead>
    
    
    
    <%
while (resultset.next()) {
 
 
%>
<tbody>
<tr>
<td><%=resultset.getString("custid") %></td>
<td><%=resultset.getString("cname") %></td>
<td><%=resultset.getString("atype") %></td>
<td><%=resultset.getString("amount")%> </td>
<td><%=resultset.getString("date") %></td>
 
 
</tr>
 
   
    </tbody>
  </table>
  
  <div> 
  <form action="updateCustomer" method="get">
<h3>here you can update your amount details </h3>
<table>
	<tr>
		<td>CustomerID</td>
		<td><input type="text" name="custid" value=<%=resultset.getString("custid")%> readonly="readonly"></td>
	</tr>
	<tr>
		<td>Update Amount:</td>
		<td><input type="text" name="amount" required></td>
	</tr> 
	<input type="hidden" name="button" value="update"> 
	<tr><td colspan="2"><input type="submit" value="update"></td></tr>
</table>
</form>
</div> 
  
 <% } %>

  <%
} else { 
%>
   <center>
<p style="font-size: large; color: red"><b><%=Message %>
</b></p></center>
<%
}
%>

 </div>



</center>



</body>
</html>​
