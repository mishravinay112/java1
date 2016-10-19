<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script language="javascript" type="text/javascript" src="load.js"></script>
 
 <script language="javascript" type="text/javascript">

 
 function dropdownlist(listindex)
 { 
document.formname.subcategory.options.length = 0;
 switch (listindex)
 {
 
 case "MBBS" :
	 document.formname.subcategory.options[0]=new Option("Select Sub-sub-Category","Select Sub-sub-Category");
	 document.formname.subcategory.options[1]=new Option("General Human Anatomy","General Human Anatomy");
	 document.formname.subcategory.options[2]=new Option("Dental Materials","Dental Materials");
	 document.formname.subcategory.options[3]=new Option("Dental Anatomy Embrylogy","Dental Anatomy Embrylogy");
	 document.formname.subcategory.options[4]=new Option("B.M.U.S","B.M.U.S");
	 document.formname.subcategory.options[5]=new Option("B.Pharma","B.Pharma");
     document.formname.subcategory.options[6]=new Option("Homeopathic Pharmacy","Homeopathic Pharmacy");
	 document.formname.subcategory.options[7]=new Option("Anatomy","Anatomy");
	 document.formname.subcategory.options[8]=new Option("Physiology including Biochemistry","Physiology including Biochemistry");
	 document.formname.subcategory.options[9]=new Option("Homeopathic Materia & Medica","Homeopathic Materia & Medica");
	 document.formname.subcategory.options[10]=new Option("Organon of Medicine, Principles ","Organon of Medicine, Principles");
	 document.formname.subcategory.options[11]=new Option("General Psychology and Sociology","General Psychology and Sociology");
	 document.formname.subcategory.options[12]=new Option("Physiology","Physiology");
	 document.formname.subcategory.options[13]=new Option("Anatomy","Anatomy");
	 document.formname.subcategory.options[14]=new Option("  Basic Occupational Therapy and Therapeutic Activities ","  Basic Occupational Therapy and Therapeutic Activities ");
	 document.formname.subcategory.options[15]=new Option("General Human Anatomy","General Human Anatomy");
	 document.formname.subcategory.options[16]=new Option("Dental Materials","Dental Materials");
	 document.formname.subcategory.options[17]=new Option("Dental Anatomy Embrylogy","Dental Anatomy Embrylogy");
	 document.formname.subcategory.options[18]=new Option("B.M.U.S","B.M.U.S");
	 document.formname.subcategory.options[19]=new Option("B.Pharma","B.Pharma");
 
 break;
 
 case "B.E" :
	     document.formname.subcategory.options[0]=new Option("Select Sub-sub-Category","Select Sub-sub-Category");
	     document.formname.subcategory.options[1]=new Option("Mathematics -I","Mathematics -I");
	     document.formname.subcategory.options[2]=new Option("Electrical Technology","Electrical Technology");
	     document.formname.subcategory.options[3]=new Option("Intro. To Manufact. Proc and WSP","Intro. To Manufact. Proc and WSP");
	     document.formname.subcategory.options[4]=new Option("Programming and Data struct","Programming and Data struct");
	     document.formname.subcategory.options[5]=new Option("Programming and Data Struct Lab","Programming and Data Struct Lab");
	     document.formname.subcategory.options[6]=new Option(" Foundations of Engineering"," Foundations of Engineering");
	     document.formname.subcategory.options[7]=new Option("Engineering Mathematics 1A","Engineering Mathematics 1A");
	     document.formname.subcategory.options[8]=new Option("Mathematical Modelling and Computation","Mathematical Modelling and Computation");
	     document.formname.subcategory.options[9]=new Option("Engineering Mechanics","Engineering Mechanics");
	     document.formname.subcategory.options[10]=new Option("Chemical Principles and Processes","Chemical Principles and Processes");
		 document.formname.subcategory.options[11]=new Option("Engineering Drawing","Engineering Drawing");
		 document.formname.subcategory.options[12]=new Option("Manufacturing Processes","Manufacturing Processes");
		 document.formname.subcategory.options[13]=new Option("Principles of Electrical Engineering","Principles of Electrical Engineering");
		 document.formname.subcategory.options[14]=new Option("Applied Mechanics","Applied Mechanics");
		 document.formname.subcategory.options[15]=new Option("Mathematics II","Mathematics II");
		 document.formname.subcategory.options[16]=new Option("Programming and Data Structures","Programming and Data Structures");
		 document.formname.subcategory.options[17]=new Option("Algoritham","Algoritham");
		 document.formname.subcategory.options[18]=new Option("Theory of Computation","Theory of Computation");
		 document.formname.subcategory.options[19]=new Option("Compiler Design","Compiler Design");
		 document.formname.subcategory.options[20]=new Option("Operating System","Operating System");
		 document.formname.subcategory.options[21]=new Option(" Fluency In Information Technology "," Fluency In Information Technology ");
		 document.formname.subcategory.options[22]=new Option("Computer Science Principles","Computer Science Principles");
		 document.formname.subcategory.options[23]=new Option("Science and Art of Digital Photography","Science and Art of Digital Photography");
		 document.formname.subcategory.options[24]=new Option(" Data Programming"," Data Programming");
		 document.formname.subcategory.options[25]=new Option(" Computer Programming "," Computer Programming ");
     
 
 break;
 
 case "Bsc" :
	     document.formname.subcategory.options[0]=new Option("Select Sub-sub-Category","Select Sub-sub-Category");
		 document.formname.subcategory.options[1]=new Option(" Fundamentals of Microbiology "," Fundamentals of Microbiology");
		 document.formname.subcategory.options[2]=new Option("Physical and Chemical aspects of Biochemistry","Physical and Chemical aspects of Biochemistry");
		 document.formname.subcategory.options[3]=new Option("Biomolecules","Biomolecules");
		 document.formname.subcategory.options[4]=new Option(" Microbial Diversity"," Microbial Diversity");
		 document.formname.subcategory.options[5]=new Option(" Environmental Biotechnology "," Environmental Biotechnology ");
 		 document.formname.subcategory.options[6]=new Option(" Microbial Chemistry and Physiology "," Microbial Chemistry and Physiology");
 		 document.formname.subcategory.options[7]=new Option("Biomolecules","Biomolecules");
 		 document.formname.subcategory.options[8]=new Option("Environmental Biotechnology","Environmental Biotechnology");
 		 document.formname.subcategory.options[9]=new Option(" Applied Microbiology"," Applied Microbiology");
 		 document.formname.subcategory.options[10]=new Option(" Prokaryotic Metabolism "," Prokaryotic Metabolism ");
		 document.formname.subcategory.options[11]=new Option(" Microbial Chemistry and Physiology "," Microbial Chemistry and Physiology");
		 document.formname.subcategory.options[12]=new Option("Foods and Nutrition","Foods and Nutrition");
		 document.formname.subcategory.options[13]=new Option("Clothing and textiles","Clothing and textiles");
		 document.formname.subcategory.options[14]=new Option("  Home Science  Extension Education","  Home Science  Extension Education");
		 document.formname.subcategory.options[15]=new Option(" Home Management/  Family Resource  Management "," Home Management/  Family Resource  Management ");
 break;
 
 case "MBA" :
	 document.formname.subcategory.options[0]=new Option("Select Sub-Category","");
     document.formname.subcategory.options[0]=new Option("Select Sub-sub-Category","");
	 document.formname.subcategory.options[1]=new Option(" Employee Benefit Planning "," Employee Benefit Planning");
	 document.formname.subcategory.options[2]=new Option("Risk Management Modeling","Risk Management Modeling");
	 document.formname.subcategory.options[3]=new Option("Perspectives on Risk and Insurance","Perspectives on Risk and Insurance");
	 document.formname.subcategory.options[4]=new Option(" Pension Planning","  Pension Planning");
	 document.formname.subcategory.options[5]=new Option(" Insurance Law "," Insurance Law ");
	 document.formname.subcategory.options[6]=new Option(" Organizational Behavior "," Organizational Behavior");
	 document.formname.subcategory.options[7]=new Option("Labor Legislation","Labor Legislation");
	 document.formname.subcategory.options[8]=new Option("Training and Development","Training and Development");
	 document.formname.subcategory.options[9]=new Option(" Strategic HRM","  Strategic HRM");
	 document.formname.subcategory.options[10]=new Option(" Global HRM "," Global HRM ");
     document.formname.subcategory.options[11]=new Option(" Tourism Principles, Policies and Practices ","Tourism Principles, Policies and Practices");
	 document.formname.subcategory.options[12]=new Option("Economics of Tourism","Economics of Tourism");
	 document.formname.subcategory.options[13]=new Option("Tourism Marketing","Tourism Marketing");
	 document.formname.subcategory.options[14]=new Option(" Socially Oriented Course"," Socially Oriented Course");
	 document.formname.subcategory.options[15]=new Option(" Computer Application in Tourism "," Computer Application in Tourism ");
	 document.formname.subcategory.options[16]=new Option(" Principles of Management ","Principles of Management");
	 document.formname.subcategory.options[17]=new Option("Financial Accounting","Financial Accounting");
	 document.formname.subcategory.options[18]=new Option("Managerial Economics","Managerial Economics");
	 document.formname.subcategory.options[19]=new Option(" Business Communication"," Business Communication");
	 document.formname.subcategory.options[20]=new Option(" Human Resources Management "," Human Resources Management");
	 document.formname.subcategory.options[21]=new Option(" Thermal Science and Engineering ","Thermal Science and Engineering");
	 document.formname.subcategory.options[22]=new Option("Mechanics of Fluids","Mechanics of Fluids");
	 document.formname.subcategory.options[23]=new Option("Managerial Economics","Managerial Economics");
	 document.formname.subcategory.options[24]=new Option(" Refrigeration and Air-conditioning"," Refrigeration and Air-conditioning");
	 document.formname.subcategory.options[25]=new Option(" Design of Machine Tools ","Design of Machine Tools");
	 document.formname.subcategory.options[26]=new Option("Finance Management","Finance Management");
	 document.formname.subcategory.options[27]=new Option("Human Resource (HR) Management","Human Resource (HR) Management");
	 document.formname.subcategory.options[28]=new Option("Tourism Management","Tourism Management");
	 document.formname.subcategory.options[29]=new Option("Risk Management","Risk Management");
 break;
 
 }
 return true;
 }
 
 
 </script>
 <script>
      
       case "MB" :
    		 break;
                alert("hi");
    	   var element=document.formname.subcategory1.getElementById('subcategory1');
                      alert("hi");
    	   if(val=='pick a color'||val=='others')
    	     element.style.display='block';
    	   else  
    	     element.style.display='none';
    	  
    	   break;
	
	 }
 return true;
 }
 </script>
</head>
<body>

<form id="formname" name="formname"  action="SaleControler" onSubmit="return validateForm()"  method="post"  enctype="multipart/form-data">
 <table width="50%" border="0" cellspacing="0" cellpadding="5" align="center">

 <tr>
 <td width="41%" align="right" valign="middle">Course :</td>
 <td width="59%" align="left" valign="middle"><select name="category" id="category"   required="required"      onchange="javascript: dropdownlist(this.options[this.selectedIndex].value);">
 <option value="">Select Category</option>
 <option value="MBBS">MBBS</option>
 <option value="B.E">B.E</option>
 <option value="Bsc">B.sc</option>
 <option value="MBA">MBA</option>
 
 </select></td>
 </tr>
 <tr>
 <td align="right" valign="middle">Subject :
 </td>
 <td align="left" valign="middle"><script type="text/javascript" language="JavaScript">
 document.write('<select name="subcategory" id="subcategory" required="required" onchange="javascript: dropdownlist1(this.options[this.selectedIndex].value);"><option value="">Select Sub-Category</option></select>')
 </script>
 <noscript><select name="subcategory" id="subcategory" >
 <option value="">Select Subject</option>
 </select>
 </noscript></td>
 </tr>
 <tr>
 
 </select>
 </noscript>
 </td>
 </tr>
 </table>
 
</form>


</body>
</html>


</body>
</html>