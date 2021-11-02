 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Management</title>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
.form{
font-size:20px;
color:#000080;
}
.hero-image {
  background-image: url("images/56.jpg");
  background-color: #cccccc;
  height:900px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

.hero-text {
  text-align:center;
  position: absolute;
  top:80%;
  left:78%;
  transform: translate(-50%, -50%);
  color: white;
}

</style>
</head>
<body>
<div class="hero-image">
  <div class="hero-text">

<h3 style="color:black ;font-size:25px">Check for Ready Orders from Kitchen</h3>

<form id="login" method="post" action="/DeliverOrder/ReadyOrderSvlt">  
<input type="submit"  value="Check " class="form">
</form>
<h3 style="color:black ;font-size:25px">Check For Free Delivery Boy</h3>
<form id="login" method="post" action="/DeliverOrder/DBoyServlet">  
<input type="submit"  value="Check " class="form">
</form>
<br>
<br>
  </div>
</div>
</body>
</html>
