<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp"%>
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
body 
{
background-color:#ffe4b5;
}
td
{
	//background-color: #e3e3e3;
	//size: 50;
	style="width:77%;height:80%;"
	text-align: center;
}

</style>
</head>
<body body background="ab.jpg">
<div class="menu">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td>
</table>
<% HttpSession sc=request.getSession();
//sc.invalidate();
String ip=(String)sc.getAttribute("ip");

if(ip!=null)
{%>
<div class="head" align="center">

</div>
<% String ss=(String)request.getAttribute("msg");
     if(ss!=null)
    	 out.println(ss);
%>
<form action="EventControler" method="post" enctype="multipart/form-data">

<center>
<table width="100" height="100" border="7" align="center">
<tr><th colspan="3" ><marquee>Post An Event</marquee></th></tr>
<tr><td width="50%" align="center" valign="middle" align="center" >Event_Name:</td><td ><input type="text" name="eventname" required size="35.5"  placeholder="Event Name" ></textarea></td></tr></center></br></br>
<tr><td width="41%" align="center" valign="middle">Event_Description:</td><td ><textarea rows="7" cols="37" name="event_description" required  placeholder="Event Description"></textarea></td></tr></center></br></br>

<tr><td width="41%" align="center" valign="middle" align="center" > Upload_Doc_File:</td><td colspan="2" align="right"><input type="file" name="file" required></td></tr></center></br></br>
<tr><td height="50" width="100" colspan="2" align="center" valign="middle" ><input type="submit" name="Submit" value="Submit"/><br><br>
</table>
</form>
 <%@include file="footer.jsp" %>
</body>

</html>
<%}

	else
	{%>
		<html>
	<body>

	<%RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	request.setAttribute("key","you are not login first you have to login");
	rd.include(request, response);
	}
%>



