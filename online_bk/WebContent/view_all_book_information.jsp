<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="buy.buy_Dto"%>
    <%@page import="buy.buy_Service"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="java.util.Iterator"%>
  <%@include file="buy_header.jsp" %>
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
margin-top: 400px;
}
</style>
</head>
<body body background="ab.jpg">
<div class="head" align="center">
All information about seller
</div>
 <%
String saler_email=request.getParameter("email");  
String s1=request.getParameter("id");
int saler_id=Integer.parseInt(s1);
        buy_Dto bd=new buy_Dto();
        bd.setSaler_email(saler_email);
        bd.setAuto(saler_id);
        buy_Service bs=new buy_Service();
        ArrayList al=bs.sallerDetails(bd);
        Iterator<buy_Dto> i=al.iterator(); 
        
         %>
         <table border="1">
        <tr><th>Seller Name</th><th>Seller Email_id</th><th>Mobile Number</th><th>Course</th><th>CourseStream</th><th>Subject</th><th>Writer Name</th><th>Edition</th><th>Book Name</th><th>Price</th><th>Negotiable Status</th><th>Book Description</th><th>City</th></tr>
        <%
        while(i.hasNext())
        {
       	 buy_Dto s=(buy_Dto)i.next();
       	%>
       	 <tr><td><%=s.getName()%></td><td><%=s.getEmail()%></td><td><%=s.getCity()%></td><td><%=s.getCourse()%></td><td><%=s.getCourseStream()%></td><td><%=s.getSubject()%></td><td><%=s.getWriter_name()%></td><td><%=s.getEdition()%></td><td><%=s.getBook_name()%></td><td><%=s.getPrice()%></td><td><%=s.getNegotiable_status()%></td><td><%=s.getBook_description()%></td><td><%=s.getMobile_number()%></td>
        <% }%>
         

 </table>
 <div class="footer">
 <%@include file="footer.jsp" %>
 </div>
</body>
</html>