<!-- Display the Employee LOGIN Page -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<link rel="stylesheet" type="text/css" href="../css/login.css">
<style type="text/css">

.image {
  background-image: url("images/472.jpg");
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
<h2>Login Page</h2>  
   <div class="bg-img">    
   <form id="login" method="post" action="/DeliverOrder/LoginServlet">
   <input type="image" src="/DeliverOrder/images/user.png" alt="Submit" width="100" height="100" class="img">
        <br><br>
        
        <label><b>User Name</b> <br>
        </label>   
         
        <input type="text" name="Uname" id="Uname" placeholder="Username">    
        <br><br>  
          
        <label><b>Password</b><br>   
        </label>    
        
        <input type="Password" name="Pass" id="Pass" placeholder="Password">    
        <br><br>
        
        <label><b>Choose Employee Type </b> <br>
        </label>
        
        <select id="employee" name="employee">
        <option value="DeliverManager" selected> Deliver Manager</option>
        <option value="DeliverBoy"> Deliver Boy</option>
        <option value ="Chef"> Chef </option>
        </select>
        <br><br>
        <input type="submit" name="log" id="log" value="Login Here">       
        <br><br>    
        <input type="checkbox" id="check">
        <span>Remember me</span>  
        <br><br>    
         
    </form>     
</div> 
</body>    
</html>     