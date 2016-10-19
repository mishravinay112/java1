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
margin-top:400px;
}
.msg
{
color: black;
font-size: 30px;

}
.head
{
font-size: 30px;
color:#C71585;
}
</style>
</head>
<body body background="ab.jpg">
<div class="header">
<center><%@include file="header.jsp" %></center>
</div>
<div class="menu2">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td></tr>
</table>
</div>
<div class="head" align="center">
<marquee><h3>Notes Upload </marquee>
</div>
<center>
<div class="msg">This website  is ongoing under construction notes page.</div></center>
<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</body>
</html>