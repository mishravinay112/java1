<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>
<center>
<%HttpSession sc=request.getSession();
sc.invalidate();
sc=null;
 RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
  request.setAttribute("key", "you are Successfully logOut");
  rd.include(request,response);
 
%>
</center>

</body>
</html>