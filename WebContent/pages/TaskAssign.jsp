<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delivery Successfull</title>
<style>
.hero-image {
  background-image: url("images/free.jpg");
  background-color: #cccccc;
  height:1100px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

</style>
</head>
<body>
<div class="hero-image">
<form action="/DeliverOrder/DeleteServlet" method="post" onsubmit="return confirm('confirm deletetion');">
<table style="font-size:25px"> 
<tr>
<th>OrderNo</th>
<th>Description</th>
<th>Telephone</th>
<th>Address</th>
<th>Receipt No</th>
<c:forEach var = "ReadyOrder01" items="${taskAssignDetails}" >

<tr>
		<td><input type="text" name="oderno" value="${ReadyOrder01.orderno}" readonly></td>
		<td><input type="text" name="name" value="${ReadyOrder01.des}" readonly></td>
		<td><input type="text" name="tele" value="${ReadyOrder01.tp}" readonly></td>
		<td><input type="text" name="address" value="${ReadyOrder01.address}" readonly></td>
		<td><input type="text" name="receiptno" value="${ReadyOrder01.receiptno}" readonly></td>	
		<td><button type="submit" name="delete" value="${ReadyOrder01.orderno}" >Delete</button></td>	
	</tr>
	
</c:forEach>
</table>




</form>
</div>
</body>
</html>