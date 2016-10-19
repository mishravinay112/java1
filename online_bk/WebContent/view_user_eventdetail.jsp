<%@page import="java.util.Iterator"%>
<%@page import="shareevent.EventDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.footer
{
  margin-top: 320px;
}
.head
{
font-size: 30px;
color: #C71585;
}
body
{

background-color:#ffe4b5;

//background-image:"ab.jpg";
//<background-image :F:\PHOTO\Zedze\woolen_art.jpg/>
font-size:20px;
}
td
{
	//background-color: #e3e3e3;
	style="width:77%;height:80%;"
	//width:"80";
	//height:"30";
	//size: 50;
	text-align: center;
	
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body body background="ab.jpg">

<div class="menu">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td>
</table>
</div>
<div class="head" align="center">

</div>
<%
 ArrayList<EventDto> ss=(ArrayList)request.getAttribute("al1"); 
 Iterator<EventDto> i=ss.iterator(); 
 %>
 <center> <table width="800" height="100" border="7" align="center">
<tr><th colspan="3" ><marquee>Uploaded Event List</marquee></th></tr>
 <tr><th>event_name</th><th>event_description</th></tr>
 <%
 while(i.hasNext())
 {
	 
	 EventDto s=(EventDto)i.next();
	 int s1=s.getEvent_status();
	 
	 %>
	 
	<tr><td align="center"><a href='DownloadingFile?filename=<%=s.getFile_path() %>'> <%=s.getEvent_name()%></td></a>
	
	
	 <td align="center"><a href='DownloadingFile?filename=<%=s.getFile_path() %>'> <%=s.getEvent_description()%></td></a>
	 </tr>
<% }%>
 </table>
 <div align="right">
<a href="Share_Event.jsp"><font color="blue"><h1>Click Here Post An Event</font></a>
</div>
 
 </center>
 
 <div class="footer">
 <%@include file="footer.jsp" %>
 </div>
 
 </body>
</html>