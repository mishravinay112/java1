<%@page import="java.util.Iterator"%>
<%@page import="admin_login.Admin_Dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body body background="ab.jpg">
 <%
 System.out.println("viewPending");
	ArrayList<Admin_Dto> al=new ArrayList<Admin_Dto>();
  al=(ArrayList)request.getAttribute("list"); 
 Iterator<Admin_Dto> i=al.iterator(); 
 %>
 
 <center> <table border="1">
 <tr><th>Name</th><th>Email_id</th><th>Mobile Number</th><th>Password</th><th>Address</th><th>Gender</th><th>State</th><th>City</th><th>Area</th><th>Pin code</th></tr>
 <%
 while(i.hasNext())
 {
	 Admin_Dto s=(Admin_Dto)i.next();
	 %>
	 <tr><td><%=s.getBook_description()%></td><td><%=s.getBook_name()%></td><td></td>
	 
	<% }%>
 </table>
 </center>
 
</body>
</html>

