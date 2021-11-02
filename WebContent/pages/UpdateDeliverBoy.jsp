<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateMyStatus</title>
<style>
 input[type=text]{
 top:50%;
  width: 35%;
  padding: 12px 15px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  font-size:20px;
}
.form{
color: black;
font-size:25px;
top:20%;
left:20%;
}
input[type=submit] {
  width: 35%;
  background-color: #DB7093;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size:20px;
  }
</style>
</head>
<body>

<h1 style="color:#C71585">UPDATE MY PROFILE</h1>
<!-- java code inside jsp file -->
<%  
// catch data which pass as parameters by DeliverBoy.jsp page
	String eid = request.getParameter("eid");
	String name = request.getParameter("name");
	String tele = request.getParameter("tele");
	String status= request.getParameter("status");
%>

<!-- form which we give for deliver boy to update his profile -->
<!-- he can not update his Employee Id -->

<form action="/DeliverOrder/UpdateServlet" method="post" class="form">
Employee ID <input type="text" name="eid" value="<%= eid %>" readonly> 
<br>
Employee Name <input type="text" name="name" value="<%= name %>">
<br>
Phone Number <input type="text" name="tele" value="<%= tele %>">
<br>
Status <input type="text" name="status" value="<%= status %>">
<br> 
<input type="submit" name="submit" value="update">


</form>

</body>
</html>