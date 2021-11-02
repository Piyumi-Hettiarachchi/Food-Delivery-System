<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ReadyOrders</title>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.hero-image {
  background-image: url("images/bunn.jpg");
  background-color: #cccccc;
  height:1100px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

.hero-text {
  text-align: center;
  position: absolute;
  top: 40%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: white;
}
table {
  border-collapse: collapse;
  width: 100%;
 table-layout: auto;
  width: 900px;  
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(odd){background-color: #000000}
tr:nth-child(even){background-color: #FF8C00}

th {
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>

<div class="hero-image">
<div class="hero-text">

  <br><br>
    <h1  style="font-size:50px">Ready Order Queue</h1>
    <h1 style="color:black">These are ready for deliver</h1>
  <br><br>
  
<table border="1" style="color:white ; font-weight:bold">
	<tr>
		<td>Order No</td><td>Order Description</td><td>Telephone</td><td>Address</td><td>Payment Receipt No</td><td>Status</td>
	</tr>
	
<c:forEach var= "rorder" items="${ReadyOrderDetails}">
	<tr>
		<td>${rorder.orderno}</td>
		<td>${rorder.des}</td>
		<td>${rorder.tp}</td>
		<td>${rorder.address}</td>
		<td>${rorder.receiptno}</td>
		<td>${rorder.status}</td>	
	</tr>
</c:forEach>
</table>

<br><br><br><br><br><br><br>
<a href="pages/DeliverManager.jsp">
<img src="/DeliverOrder/images/back.png" align="right" height="120px" width="120px">
</a>
</div>
</div>
</body>
</html>






