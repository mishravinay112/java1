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
body 
{
background-color:#ffe4b5;
}
td
{
	//background-color: #e3e3e3;
	size: 50;
	text-align: center;
}
.footer
{
width:100%;
height:80px;
background-color:white;
margin-top:355px;
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
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="login.jsp" style="text-decoration: none;">Login</a></td><td align="center"><a href="registration.jsp" style="text-decoration: none;">Sign Up</a></td></tr>
</table>
</div>
<div class="head" align="center">

</div>
<font color="red">
<%String msg1=(String)request.getAttribute("msg");
if(msg1!=null)
out.print(msg1);%>
<%HttpSession hs1=request.getSession();
String admin_id=(String)hs1.getAttribute("admin_id");
if(admin_id==null)
{%>
<center><table width="100" height="100" border="7" align="center">
<tr><th colspan="3" ><marquee>Admin Login</marquee></th></tr>
<form action="Admin_Login"method="post">
<tr><td>Admin_Id:</td><td><input type="text" name="admin_id"></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
<tr><td height="50" width="100" colspan="2" align="center"><input type="submit" value="Login" ></td></tr>
</table>
</center>
<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</body>
</html>
<%}
else
{
RequestDispatcher rd=request.getRequestDispatcher("admin_link.jsp");
rd.forward(request,response);
}%>
