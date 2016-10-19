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
.menu
{
width:100%;
height:80px;
background-color:white;
}
.footer
{
width:100%;
height:80px;
background-color:white;
margin-top:300px;
}
.head
{
font-size: 30px;
color: #C71585;
}
</style>
</head>
<body body background="ab.jpg">
<div class="header">
<center><%@include file="header.jsp" %></center>
</div>
<div class="menu">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td></tr>
</table>
</div>

<div class="head" align="center">
Admin control link
</div>


<center><table>
<tr><td></td><td><a href="pending_statusServlet" style="text-decoration: none;"><font size="6" color="red" >Pending User status</font ></td></tr>
<tr><td></td><td> <a href="View_Reg_Controller" style="text-decoration: none;"><font size="6" color="red">View Register User</font ></a></td></tr>
<tr><td></td><td><a href="EventAdminControler" style="text-decoration: none;"><font size="6" color="red">View Event</font ></a></td></tr>
</table>
</center>
<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</body>
</html>