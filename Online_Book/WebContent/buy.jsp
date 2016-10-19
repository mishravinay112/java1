<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
 HttpSession sc=request.getSession();

String ip=(String)sc.getAttribute("ip");
//sc.setAttribute("ip",ip);


if(ip!=null)
{%>
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


<%String s1=(String)request.getAttribute("msg");

if(s1!=null)
{
	out.print(s1);
}
%>
<center>
<% HttpSession sc12=request.getSession();
String username=(String)sc12.getAttribute("username");
if(username!=null)
{ out.print("<h3>Welcome:"+username+"<h3>");}%>
<form action="buy_controller">
<h3>Enter The Course    <input type="text"name=course></br></br>
Enter The Subject   <input type="text"name=subject></br></br>
Enter The City      <input type="text"name=city></br></br>
<input type="submit"value="Search"></h3>
</form>
</center>
<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</body>
</html>
<%}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	request.setAttribute("key","you are not login first you have to login");
	rd.include(request, response);
}
%>