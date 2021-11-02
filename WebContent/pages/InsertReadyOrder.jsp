<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addToReadyQueue</title>
<style type="text/css">

 input[type=text]{
 top:50%;
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  left: 25%;
}
.form{
color: black;
font-size:25px;
top:20%;
left:20%;
}

input[type=submit] {
  width: 35%;
  background-color: #F08080;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.hero-text {
  text-align: center;
  position: absolute;
  top: 40%;
  left: 20%;
  transform: translate(-50%, -50%);
  color: white;
}
</style>
</head>
<body>

<h1 style="color:#DB7093">ADD TO READY QUEUE</h1><br><br>
<form action="/DeliverOrder/InsertServlet" method="post" class="form">
Order Number <input type="text" name="orderno" placeholder="Enter the Order Number : OD----">
<br>
Order Description <input type="text" name="des" placeholder="Enter the Order Description">
<br>
Customer Tp <input type="text" name="tp" placeholder="Enter the Customer phone Number">
<br>
Customer Address <input type="text" name="address" placeholder="Enter the Customer address">
<br>
Payment Receipt No <input type="text" name="receiptno" placeholder="Enter the payment receipt No">
<br>

<input type="submit" name="submit" value="Add to Ready Queue">
</form>
</body>
</html>