<%@page import="java.util.ListIterator"%>
<%@page import="javax.swing.text.html.HTMLDocument.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="view_registration.View_Reg_Dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.footer
{
margin-top: 400px;
}
.head
{
font-size: 30px;
color: white;
}
</style>
</head>
<body body background="ab.jpg">
<div class="menu">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td>
</table>
<div class="head" align="center">
Register Users
</div>
<form method="get">
 <%
 ArrayList<View_Reg_Dto> ss=(ArrayList)request.getAttribute("list"); 
 ListIterator<View_Reg_Dto> i=ss.listIterator();
 %>
 <center> <table border="1" width="100%">
 <tr><th>Name</th><th>Email_id</th><th>Password</th><th>Mobile Number</th><th>College</th><th>Address</th><th>Gender</th><th>State</th><th>City</th><th>Area</th><th>Pin code</th><th>Status</th><th>User_id</th><th>Link</th></tr>
 <%
 while(i.hasNext())
 {
	 View_Reg_Dto s=(View_Reg_Dto)i.next();
	 %>
	 <tr><td><%=s.getName()%></td><td><%=s.getEmail()%></td><td><%=s.getPassword()%></td><td><%=s.getMobile()%></td><td><%=s.getCollege()%></td><td><%=s.getAddress()%></td><td><%=s.getGender()%></td><td><%=s.getState()%></td><td><%=s.getCity()%></td><td><%=s.getArea()%></td><td><%=s.getPincode()%></td><td><%=s.getStatus()%></td><td><%=s.getUserid()%></td>
	 <td>
	 <a href='Deletet_Reg_Controller?ugmail=<%=s.getEmail()%>'><font  color="red">delete</font></a></td><br>
	 <% }%>
 </table>
 </center> 
 


</form>
<div class="footer">
<%@include file="footer.jsp"%>
</div>
</body>
</html>