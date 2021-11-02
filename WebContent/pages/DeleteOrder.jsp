<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String orderno= request.getParameter("orderno");
String description = request.getParameter("des");
String tele = request.getParameter("tp");
String address= request.getParameter("address");
String receiptno= request.getParameter("receiptno");
%>


<h1>Delivery Complete</h1>
<form action="/DeliverOrder/DeleteServlet" method="post">
Employee ID <input type="text" name="orderno" value="<%= orderno %>" readonly> 
<br><br>
Employee Name <input type="text" name="name" value="<%= description %>" readonly>
<br><br>
Phone Number <input type="text" name="tele" value="<%= tele%>" readonly>
<br><br>
Address<input type="text" name="address" value="<%=address %>>" readonly>
<br><br>
Status <input type="text" name="receiptno" value="<%= receiptno %>" readonly>
<br><br> 
<input type="submit" name="submit" value="Delete">


</form>

</body>
</html>