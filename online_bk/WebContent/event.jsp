<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.header
{
width:100%;
height:80px;
}
.menu2
{
width:100%;
height:80px;
background-color:white;
}
.footer
{
width:100%;
height:60px;
background-color:white;
margin-top:180px;
}
</style>
</head>
<body>
<div class="header">
<center><%@include file="header.jsp" %></center>
</div>
<div class="menu2">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td></tr>
</table>
</div>
<center><table>
<tr><td>College Name:</td><td><input type="text" name="name"></td></tr>
<tr><td>Event Type:</td><td><input type="text" name="email"></td></tr>
<tr><td>Date:</td><td><input type="password" name="password"></td></tr>
<tr><td>Time:</td><td><input type="text" name="mobile"></td></tr>
<tr><td>Registration fee</td><td><input type="radio" name="a" value="yes" required>Yes
           <input type="radio" name="a" value="no"required>No</td></tr>
 <tr><td>How much Fee:</td><td><input type="text" name="college"></td></tr>              
<tr><td>city:</td><td><input type="text" name="city"></td></tr>
<tr><td>Pin:</td><td><input type="text" name="pin"></td></tr>
<tr><td></td><td><input type="submit" value="Save"></td></tr>
</table>
</center>
<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</body>
</html>