<%@page import="java.util.Iterator"%>
<%@page import="shareevent.EventDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.head
{
font-size: 30px;
color: #C71585;
}
.footer
{
margin-top: 300px;
}
.header
{
height: 75px;
}
</style>
</head>
<body body background="ab.jpg">
<div class="header">
 <%@include file="header.jsp" %>
</div>
<div class="menu">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td>
</table>

<div class="head" align="center">
Admin Event Control
</div>
<%
 
 ArrayList<EventDto> ss=(ArrayList)request.getAttribute("al1"); 
 Iterator<EventDto> i=ss.iterator(); 

 %>
 <center> <table border="1" width="100%">
 <tr><th>email_id</th><th>event_description</th><th>event_name</th><th>delete</th><th>download</th><th>Link</th></tr>
 <%
 while(i.hasNext())
 {
	 
	 EventDto s=(EventDto)i.next();
	 int s1=s.getEvent_status();
	 
	 %>
	 <tr><td><%=s.getEmail_id()%></td><td><%=s.getEvent_description()%></td><td><%=s.getEvent_name()%></td>
	 <td>
	 <a href='Delete_Eventinformation_Controler?uname=<%=s.getEvent_id() %>'><color="blue">Delete</a>
	 
	 </td>
	 <td>
	  	  <%=s.getFile_path() %>
	  	  <form action='DownloadingFile'>
	  	 <%String s2=s.getFile_path(); %>
	  	   <input type='hidden' name='filename' value=<%=s.getFile_path() %>>
	 <input type='submit' value='Download'>
	 </form>
	 </td>
	 
	 <td><% if(s1!=0){%><a href='eventdisable?email=<%=s.getEvent_id()%>'>disable</a><%}else{%><a href='eventenable?email=<%=s.getEvent_id()%>'>enable</a><%}%></td>
	 
	 
	<% }%>
 </table>
 </center>
 <div class="footer">
 <%@include file="footer.jsp" %>
 </div>
</body>
</html>