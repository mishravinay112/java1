
<html>
<head>
<style>
.header
{
width:100%;
height:90px;
}
body
{

//background-color:#ffe4b5;

//background-image:"F:\PHOTO\Zedze\woolen_art.jpg";
//<background-image :F:\PHOTO\Zedze\woolen_art.jpg/>
font-size:20px;
}
.menu
{
width:100%;
height:60px;
background-color:white;
}
.menu1
{
width:100%;
height:0px;
background-color:white;
margin-top: 40px;
}
.left
{
width:33%;
height:400px;
background-color:yellow;
float:left;

}

.right
{
width:33%;
height:400px;
background-color:yellow;
float:right;

}
.center
{
width:100%;
height:400px;
float:center;

}
.footer
{
width:100%;
height:60px;
background-color:white;
margin-top:420px;
}
.classname a{
 color:#FFFFF;
 text-decoration: none;
}
</style>
</head>
<body background="ab.jpg">
<%HttpSession sc2=request.getSession();
String email=(String)sc2.getAttribute("ip"); %>
<div class="header">
<%@include file="header.jsp" %>

</div>
<div class="menu">
<table border="12" width="100%" height="60px" >
<tr><td align="center" ><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><% if(email!=null){%><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td><%} else{%><td align="center"><a href="login.jsp" style="text-decoration: none;">Login</a></td><td align="center"><a href="registration.jsp" style="text-decoration: none;">Sign Up</a></td></tr><% }%>
</table>
</div>
<%if(email==null){ %>
<a href="admin.jsp" ><h3>Admin Login</a>
 <center><font color="red">
<%String ss=(String)request.getAttribute("key");
  if(ss!=null)
	  out.println(ss);
%>
<%String ss1=(String)request.getAttribute("msg");
  if(ss1!=null)
	  out.println(ss1);
%></font></center>
<div class="menu1">
<table border="0" width="100%" height="180px">
 <tr><td align="center"><a href="search.jsp" style="text-decoration: none;"><img src="buy.jpg" alt="Buy" style="float:center;width:150px;height:200px"></a></td><td align="center"><a href="Share_Event.jsp" style="text-decoration: none;"><img src="events.jpg" alt="Events" style="float:center;width:150px;height:200px"></a></td><td align="center"><%//HttpSession sc=request.getSession();String email=(String)sc.getAttribute("email");sc.setAttribute("email",email);if(email!=null) {%><a href="sale.jsp" style="text-decoration: none;"><img src="sell.jpg" alt="Sell" style="float:center;width:150px;height:200px"><a href="login_registration.jsp"><%//}else{System.out.println("home.jsp else"+sc);%><html>
<body>

</a> </a></td></tr>
<!--  <tr><td align="center"><a href="notes.jsp" style="text-decoration: none;"><img src="notes.jpg" alt="Notes" style="float:center;width:150px;height:200px"></a></td>--></tr>
</table>
</div>
<div class="footer">
<center>
<%@include file="footer.jsp" %>
</center>
</div>

</body>
</html>
<%}else{ %>
<div align="right">
<% HttpSession sc12=request.getSession();
String username=(String)sc12.getAttribute("username");
if(username!=null)
{ out.print("<h3>Welcome:"+username+"<h3>");}%>
</div>
 <center>
 <font color="red">
<%String ss=(String)request.getAttribute("key");
  if(ss!=null)
	  out.println(ss);
%>
<%String ss1=(String)request.getAttribute("msg");
  if(ss1!=null)
	  out.println(ss1);
%></font></center>
<div class="menu1">
<table border="0" width="100%" height="180px">
 <tr><td align="center"><a href="search.jsp" style="text-decoration: none;"> <img src="buy.jpg" alt="Buy" style="float:center;width:150px;height:200px"></a></td><td align="center"><a href="ViewEventControler" style="text-decoration: none;"><img src="events.jpg" alt="Events" style="float:center;width:150px;height:200px"></a></td><td align="center"><%//HttpSession sc=request.getSession();String email=(String)sc.getAttribute("email");sc.setAttribute("email",email);if(email!=null) {%><a href="sale.jsp" style="text-decoration: none;"><img src="sell.jpg" alt="Sell" style="float:center;width:150px;height:200px"><a href="login_registration.jsp"><%//}else{System.out.println("home.jsp else"+sc);%><html>
<body>

</a> </a></td></tr>
<!--  <tr><td align="center"><a href="notes.jsp" style="text-decoration: none;"><img src="notes.jpg" alt="Notes" style="float:center;width:150px;height:200px"></a></td></tr>-->
</table>
</div>
<div class="footer">
<center>
<%@include file="footer.jsp" %>
</center>
</div>
</body>
</html>
<% }%>
