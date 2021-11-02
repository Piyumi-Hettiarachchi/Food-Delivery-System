<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeliveryBoy</title>
<style type="text/css">
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
 input[type=text] {
  font-size:20px;
  width: 40%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
table {
  border-collapse: collapse;
  width: 100%;
 table-layout: auto;
  width: 800px;  
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(odd){background-color: #90EE90}
tr:nth-child(even){background-color: #FFB6C1}

th {
  background-color: #4CAF50;
  color: white;
}
.form{
font-weight:bold; 
font-size:25px;
}

input[type=submit] {
  font-size:20px;
  width: 40%;
  background-color: #20B2AA;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
.hero-image {
  background-image: url("images/food.jpg");
  background-color: #cccccc;
  height:1100px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

.hero-text {
  color:black;
  text-align: center;
  position: absolute;
  top: 30%;
  left: 50%;
  transform: translate(-50%, -50%);
 
}

</style>
</head>
<body>

<div class="hero-image">
<div class="hero-text">
<h1>Welcome !!</h1>
<table border="1" style="color:black ; font-weight:bold">

	<tr><td>Employee ID</td>
	<td>Employee Name</td>
	<td>Telephone</td>
	<td>Status</td></tr>
	
<c:forEach var= "deliveryboy" items="${DeliveryBoyDetails}">

	<tr><td>${deliveryboy.empid}</td>
	<td>${deliveryboy.name}</td>
	<td>${deliveryboy.tele}</td>
	<td>${deliveryboy.status}</td></tr>
	
</c:forEach>
</table>
<br><br>
<h1>Assign Task To The Deliver Boys</h1>

<form action="/DeliverOrder/TaskSaveServlet" method="post" class="form">
Employee ID  <input type="text" name="empid" value="empid">
<br>
Order Number <input type="text" name="orderno" value="orderno" >
<br>
Update Status <input type="text" name="status" value="status" >
<br><br> 
<input type="submit"  name="submit" value="Assign Task">
</form>
</div>
</div>
<br><br>
</body>
</html>





