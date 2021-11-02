<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeliveryBoy</title>
<style>
h1 {
  text-decoration: underline overline wavy red;
 
}
.hero-image {
  background-image: url("images/free.jpg");
  background-color: #cccccc;
  height:1100px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

table {
  border-collapse: collapse;
  width: 100%;
  table-layout: auto;
  width: 700px; 
  table-padding: 100px;
  font-size:30px; 
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(odd){background-color: #00BFFF}
tr:nth-child(even){background-color:#9370DB}

th {
  background-color: #4CAF50;
  color: white;
}
</style>

</head>
<body>
<div class="hero-image">
<h1>Welcome !!</h1>
<br><br>
<table border="1" style="color:black ; font-weight:bold " class="table">

<!-- show deliver boy's profile data when he login  -->
<c:forEach var= "DBoy" items="${BoyDetails}">


<!-- Assign to variables to deliver boy's data-->
<c:set var="eid" value = "${DBoy.getEmpid()}"/>
<c:set var="name" value = "${DBoy.getName()}"/>
<c:set var="tele" value = "${DBoy.getTele()}"/>
<c:set var="status" value = "${DBoy.getstatus()}"/>

	<tr>
	<td>Employee ID</td>
	<td>${DBoy.getEmpid()}</td>
	</tr>
	<tr>
	<td>Employee Name</td>
	<td>${DBoy.getName()}</td>
	</tr>
	<tr>
	<td>Telephone</td>
	<td>${DBoy.getTele()}</td>
	</tr>
	<tr>
	<td>Status</td>
	<td>${DBoy.getstatus()}</td>
	</tr>
	

</c:forEach>
</table>
<br><br><br>

<h1>!! YOU MAY HAVE ASSIGN TASKS TO COMPLETE !!</h1>

<form id="taskAssigned" method="post" action="/DeliverOrder/TaskAssignServlet">
<button type="submit" name="check" value="${eid}" style="font-size:25px">Check Assign Tasks</button>
</form>
<br><br><br>
<h1> <mark>UPDATE MY PROFILE</mark></h1>
<h1>---Update Your Status Into "Task Assign" When You Leave With The Food Package---</h1>

<!-- data should be pass when navigate to UpdateDeliverBoy.jsp page -->
<c:url value="/pages/UpdateDeliverBoy.jsp"  var = "updatedboy">
<c:param name="eid" value="${eid}"/>
<c:param name="name" value="${name}"/>
<c:param name="tele" value="${tele}"/>
<c:param name="status" value="${status}"/>

</c:url>
<a href="${ updatedboy}">
<input type="button" name="Update" value="Update"  style="font-size:25px">
</a>
</div>
</body>
</html>