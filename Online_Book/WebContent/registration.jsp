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
	style="width:77%;height:80%;"
	//width:"80";
	//height:"30";
	//size: 50;
	text-align: center;
}
.footer
{
width:100%;
height:60px;
background-color:white;
margin-top:200px;
}
.head{
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
<table>
<script language="javascript" type="text/javascript">  
function validate_registration(){ 
	var user_name=document.reg_form.username.value;  
	var user_pattern=/^[0-9]$/;
	var user_password=document.reg_form.userpassword.value;
	var confirm_password=document.reg_form.confirmpassword.value;
 	var email_name=document.reg_form.useremail.value;  
  	var email_fi=email_name.indexOf("@");  
  	var email_li=email_name.lastIndexOf(".");   
  	var mobile_no = document.reg_form.mobileno.value;
    var pattern=/^[987][0-9]{9}$/;
    var pin_code = document.reg_form.pincode.value;
    var pattern_pincode=/^[0-9]{6}$/;
 
  	if (user_name=="null"||user_name.trim().length==0){  
	document.getElementById('user_id').innerHTML="please enter name ";
	document.reg_form.username.focus();
    return false;
	} 	   
	else if(user_password.length<6||user_password.trim().length==0){  
	document.getElementById('password_id').innerHTML="password at least 6 digit ";
	document.reg_form.userpassword.focus();
   	return false;  
    }
	else if(confirm_password !=user_password||confirm_password.trim().length==0){ 
		document.getElementById('cpassword_id').innerHTML="confirm password is not valid ";
		document.reg_form.confirmpassword.focus();
	   	return false;  
	}
	else if (email_fi<1 || email_li<email_fi+2 || email_li+3>=email_name.length){  
	document.getElementById('email_id').innerHTML="Please enter a valid e-mail";
	document.reg_form.useremail.focus();
    return false;  
    }
	else if(!(pattern.test(mobile_no))){ 
		document.getElementById('mobile_id').innerHTML="Please enter valid mobile number";
		document.reg_form.mobileno.focus();
	   	return false;  
	}
	else if(!(pattern_pincode.test(pin_code))||pin_code.trim().length==0){ 
		document.getElementById('pincode_id').innerHTML="Please enter valid pincode";
		document.reg_form.pincode.focus();
	   	return false;  
	}
	
}
</script>
<script language="javascript" type="text/javascript">
 
 function dropdownlist2(listindex)
 { 
	document.reg_form.city.options.length = 0;
 	switch (listindex)
 	{
 
	 case "MP" :
		 document.reg_form.city.options[0]=new Option(".....Select....","");	 
		 document.reg_form.city.options[1]=new Option("Anuppur","Anuppur");
		 document.reg_form.city.options[2]=new Option("Ashoknagar","Ashoknagar");
		 document.reg_form.city.options[3]=new Option("Betul","Betul");
		 document.reg_form.city.options[4]=new Option("Bhind","Bhind");
		 document.reg_form.city.options[5]=new Option("Bhopal","Bhopal");
		 document.reg_form.city.options[6]=new Option("Chhatarpur","Chhatarpur");
		 document.reg_form.city.options[7]=new Option("Datia","Datia");
		 document.reg_form.city.options[8]=new Option("Dewas","Dewas");
		 document.reg_form.city.options[9]=new Option("Guna","Guna");
		 document.reg_form.city.options[10]=new Option("Gwalior","Gwalior");
		 document.reg_form.city.options[11]=new Option("Indore","Indore");
		 document.reg_form.city.options[12]=new Option("Jabalpur","Jabalpur");
		 document.reg_form.city.options[13]=new Option("Khandwa","Khandwa");
		 document.reg_form.city.options[14]=new Option("Mandsaur","Mandsaur");
		 document.reg_form.city.options[15]=new Option("Neemuch","Neemuch");
		 document.reg_form.city.options[16]=new Option("Rewa","Rewa");
		 document.reg_form.city.options[17]=new Option("Sagar","Sagar");
		 document.reg_form.city.options[18]=new Option("Shivpuri","Shivpuri");
		 document.reg_form.city.options[19]=new Option("Ujjan","Ujjan");
		 document.reg_form.city.options[20]=new Option("Vidisha","Vidisha"); 
	break;
 case "UP" :
	 document.reg_form.city.options[0]=new Option(".....Select....","");
	 document.reg_form.city.options[1]=new Option("Agra","Agra")
	 document.reg_form.city.options[2]=new Option("Allahabad","Allahabad");
	 document.reg_form.city.options[3]=new Option("Banda","Banda");
	 document.reg_form.city.options[4]=new Option("Chitrakoot","Chitrakoot");
	 document.reg_form.city.options[5]=new Option("Fatehpur","Fatehpur");
	 document.reg_form.city.options[6]=new Option("Jhansi","Jhansi"); 
	 break;
 case "RJ" :
	 document.reg_form.city.options[0]=new Option(".....Select....","");
	 document.reg_form.city.options[1]=new Option("Ajmer","Ajmer");
	 document.reg_form.city.options[2]=new Option("Jodhpur","Jodhpur");
	 document.reg_form.city.options[3]=new Option("Jaipur","Jaipur");
	 document.reg_form.city.options[4]=new Option("Kota","Kota");
	 document.reg_form.city.options[5]=new Option("Fatehpur","Fatehpur");
	 document.reg_form.city.options[6]=new Option("Udaipur","Udaipur");
	 break;
 case "Delhi" :
	 document.reg_form.city.options[0]=new Option(".....Select....","");
	 document.reg_form.city.options[1]=new Option("Central Delhi","Central Delhi");
	 document.reg_form.city.options[2]=new Option("East Delhi","East Delhi");
	 document.reg_form.city.options[3]=new Option("New Delhi","New Delhi");
	 document.reg_form.city.options[4]=new Option("North Delhi","North Delhi");
	 document.reg_form.city.options[5]=new Option("South Delh","South Delh");
	 document.reg_form.city.options[6]=new Option("West Delhi","West Delhi");
 break;

 }
 return true;
 }
 </script> 
 
</head> 
<body>


<font color="red">
<%String ss=(String)request.getAttribute("msg");
  if(ss!=null)
	  out.print(ss);

%>

</font>
<form id="reg_form" name="reg_form" method="post" action="Registration" onSubmit="return validate_registration()" >
<div class="head" align="center">

</div>
<div>
<center>
<table width="600" height="600" border="7" align="center">
<tr><th colspan="3" ><marquee>User Registration</marquee></th></tr>
<tr>
	<td col width="20" height="30">User name:<br/></td>
    <td width="100" align="center">
    <input name="username" type="text"  size="33"  placeholder="User Name" /><span id="user_id"  style="color:#F00" ; ></span>
    </td>
</tr>

	<tr><td width="100" >Gender:<br/></td><td align="center" width="100"><input type="radio" requrire="requrie" name="gender" value="Male"/><span>Male</span> 
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gender"  value="Female"  /><span>Female</span>
     </td>
</tr>

<tr>   
	<td width="100" height="30">Passward:<br/></td>
    <td width="100" align="center"> <input name="userpassword" type="password"   placeholder="Password" size="33" />
    <br/>  <span id="password_id"  style="color:#F00" font size="3" ; > </span> </td>
    </tr>
<tr>   
	<td width="100" height="30">Confirm Passward:<br/></td>
    <td width="100" align="center"> <input name="confirmpassword" type="password"   placeholder="Confirm Password" size="33" />
    <br/>  <span id="cpassword_id" style="color:#F00" font size="3" ; > </span> </td>
    </tr>

<tr>
	<td width="100">Email :<br/></td>
    <td width="100" align="center">
    <input name="useremail" type="text"   size="33"  placeholder="Email-id">
    <span id="email_id" style="color:#F00" ; > </span> <br/>
    </td>
</tr>
<tr>
      <td width="100">Mobile number:<br/></td>
      <td width="100" align="center"><input name="mobileno"  type="text"  size="33" placeholder="Mobile Number">
       <span id="mobile_id" style="color:#F00" ; > </span></td>
</tr>
<tr>
      <td width="100">College:<br/></td>
      <td width="100" align="center"><input name="college"  type="text"  size="33" placeholder="College">
       <span id="mobile_id" style="color:#F00" ; > </span></td>
</tr>
<tr>
 <td width="20" align="">State :</td>
 <td align="center"><select style="width:80%;height:80%;" name="state" id="state"   required="required"      onchange="javascript: dropdownlist2(this.options[this.selectedIndex].value);">
 <option value="">Select state</option>
 <option value="MP">Madhya Pradesh(MP)</option>
 <option value="UP">Uttar Pradesh(UP)</option>
 <option value="RJ">Rajasthan(RJ)</option>
 <option value="Delhi">Delhi(DL)</option>
 
 </select></td>
 </tr>
 <tr>
 <td width="20" align="">City :
 </td>
 <td align="center"><script type="text/javascript" language="JavaScript">
 document.write('<select style="width:80%;height:80%;" name="city" id="city" required="required" onchange="javascript: dropdownlist3(this.options[this.selectedIndex].value);"><option value="">Select city</option></select>')
 </script>
 <noscript><select name="city" id="city" >
 <option value="">Select city</option>
 </select>
 </noscript></td>
 </tr>
 
 
 </select>
 </noscript>
 </td>
 </tr>


 <tr>
	<td col width="200" height="30">Area:<br/></td>
    <td width="200" align="center">
    <input name="area" type="text"  size="33"  placeholder="Area" />
    </td>
</tr>
<tr>
	<td width="100">Address :<br/></td>
    <td width="100" align="center"><textarea name="address"   style="width:255px" cols="25" id="addr" placeholder="Address"></textarea>
    </td>
</tr>
<tr>
	<td col width="200" height="30">Pin code:<br/></td>
    <td width="200" align="center">
    <input name="pincode" type="text"  size="33"  placeholder="Pin-code" />
    <span id="pincode_id" style="color:#F00" ; > </span></td>
</tr>
    <tr>
      <td height="50" width="100" colspan="2" align="center" > <input class="ss" type="submit"  value="Submit">     </tr>
 
</table>
</center>
</div>
</form>
</table>
</center>
<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</body>
</html>