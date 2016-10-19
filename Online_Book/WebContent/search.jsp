<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<% 
 HttpSession sc=request.getSession();
//sc.invalidate();
String ip=(String)sc.getAttribute("ip");
//sc.setAttribute("ip",ip);


if(ip!=null)
{%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.header
{
width:100%;
height:80px;
}
.head
{
font-size: 30px;
color: #C71585;
}
.menu2
{
width:100%;
height:80px;
background-color:white;
}
.footer
{
width:100%;
height:60px;
background-color:white;
margin-top:400px;
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

.msg
{
color: black;
font-size: 30px;

}
</style>

<script language="javascript" type="text/javascript" src="load.js"></script>
 
 <script language="javascript" type="text/javascript">
 function dropdownlist(listindex)
 {
	 
	 
	 
 
document.formname.subcategory.options.length = 0;
 switch (listindex)
 {
 
 case "MBBS" :
 document.formname.subcategory.options[0]=new Option("....select stream....","");
 document.formname.subcategory.options[1]=new Option("B.D.S","B.D.S");
 document.formname.subcategory.options[2]=new Option("B.H.M.S","B.H.M.S");
 document.formname.subcategory.options[3]=new Option("B.O.T","B.O.T");
 document.formname.subcategory.options[4]=new Option("B.M.U.S","B.M.U.S");
 document.formname.subcategory.options[5]=new Option("B.Pharma","B.Pharma");
 
 break;
 
 case "B.E" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
 document.formname.subcategory.options[1]=new Option("Computer Science","Computer Science");
 document.formname.subcategory.options[2]=new Option("Civil","Civil");
 document.formname.subcategory.options[3]=new Option("Electrical & Electronics","Electrical & Electronics");
 document.formname.subcategory.options[4]=new Option("Information Technology","Information Technology");
 document.formname.subcategory.options[5]=new Option("Mechnical","Mechnical");
 
 break;
 
 case "B.Sc" :
document.formname.subcategory.options[0]=new Option("....select stream....","");
 document.formname.subcategory.options[1]=new Option("BIO","BIO");
 document.formname.subcategory.options[2]=new Option("Computer Science","Computer Science");
 document.formname.subcategory.options[3]=new Option("Home Science","Home Science");
 document.formname.subcategory.options[4]=new Option("Micro Biology","Micro Biology");
 document.formname.subcategory.options[5]=new Option("Maths","Maths");

 break;
 
 case "MBA" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("Finance Management","Finance Management");
	 document.formname.subcategory.options[2]=new Option("Human Resource (HR) Management","Human Resource (HR) Management");
	 document.formname.subcategory.options[3]=new Option("Risk Management","Risk Management");
	 document.formname.subcategory.options[4]=new Option("Tourism Management","Tourism Management");
	 break;
	 
 case "B.A" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("(Hons) Marketing","(Hons) Marketing");
	 document.formname.subcategory.options[2]=new Option("History","History");
	 document.formname.subcategory.options[3]=new Option("Journalism & Mass Communication","Journalism & Mass Communication");
	 document.formname.subcategory.options[4]=new Option("Sociology","Sociology");
	 
	 break;
	 
 case "B.COM" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("Accounting and Finance","Accounting and Finance");
	 document.formname.subcategory.options[2]=new Option("Computers","Computers");
	 document.formname.subcategory.options[3]=new Option("Honors","Honors");
	 break;
	 
 case "Ph.D." :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("Banking & Finance","Banking & Finance");
	 document.formname.subcategory.options[2]=new Option("Statistics","Statistics");
	 break;
 case "MCA" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("Computer Application","Computer Application");
	 break;
 case "M.Sc" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("Cs&IT","Cs&IT");
	 document.formname.subcategory.options[3]=new Option("Chemistry","Chemistry");
	 document.formname.subcategory.options[4]=new Option("Physics","Physics");
	 document.formname.subcategory.options[5]=new Option("Math","Math");
	 break;
 case "M.Com" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("CS","CS");
	 document.formname.subcategory.options[2]=new Option("Finance Management","Finance Management");
	 document.formname.subcategory.options[3]=new Option("Finance and Taxation","Finance and Taxation");
	 break;	 
 case "B.Tech" :
	 document.formname.subcategory.options[0]=new Option("....select stream....","");
	 document.formname.subcategory.options[1]=new Option("Bio-Technology","Bio-Technology");
	 document.formname.subcategory.options[2]=new Option("Information Technology","Information Technology");
	 document.formname.subcategory.options[3]=new Option("Electronics and Telecom","Electronics and Telecom");
	 document.formname.subcategory.options[4]=new Option("Mechanical","Mechanical");

	 break;

 

	 

	 
	 
	
 
	 
 }
 return true;
 
 
 
 
 }
 
 </script>
 <script type="text/javascript">
 function dropdownlist1(listindex)
 {
	 
	 document.formname.subcategory1.options.length = 0;
	
	 switch(listindex)
	 {
	 
	 case "B.D.S" :
		 
		 document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option("General Human Anatomy","General Human Anatomy");
		 document.formname.subcategory1.options[2]=new Option("Dental Materials","Dental Materials");
		 document.formname.subcategory1.options[3]=new Option("Dental Anatomy Embrylogy","Dental Anatomy Embrylogy");
		 document.formname.subcategory1.options[4]=new Option("B.M.U.S","B.M.U.S");
		 document.formname.subcategory1.options[5]=new Option("B.Pharma","B.Pharma");
		 
		 break;
 
	 case "B.H.M.S" :
		 
		 document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option("Homeopathic Pharmacy","Homeopathic Pharmacy");
		 document.formname.subcategory1.options[2]=new Option("Anatomy","Anatomy");
		 document.formname.subcategory1.options[3]=new Option("Physiology including Biochemistry","Physiology including Biochemistry");
		 document.formname.subcategory1.options[4]=new Option("Homeopathic Materia & Medica","Homeopathic Materia & Medica");
		 document.formname.subcategory1.options[5]=new Option("Organon of Medicine, Principles ","Organon of Medicine, Principles");
		 
		 break;

	 case "B.O.T" :
		 
		 document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option("General Psychology and Sociology","General Psychology and Sociology");
		 document.formname.subcategory1.options[2]=new Option("Physiology","Physiology");
		 document.formname.subcategory1.options[3]=new Option("Anatomy","Anatomy");
		 document.formname.subcategory1.options[4]=new Option("  Basic Occupational Therapy and Therapeutic Activities ","  Basic Occupational Therapy and Therapeutic Activities ");
		 
		 
		 break;
 
	 case "B.M.U.S" :
		 
		 document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option("General Human Anatomy","General Human Anatomy");
		 document.formname.subcategory1.options[2]=new Option("Dental Materials","Dental Materials");
		 document.formname.subcategory1.options[3]=new Option("Dental Anatomy Embrylogy","Dental Anatomy Embrylogy");
		 document.formname.subcategory1.options[4]=new Option("B.M.U.S","B.M.U.S");
		 document.formname.subcategory1.options[5]=new Option("B.Pharma","B.Pharma");
		 
		 break;
 
	 case "B.Pharma" :
		 
		 document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option("Pharmaceutical Chemistry","Pharmaceutical Chemistry");
		 document.formname.subcategory1.options[2]=new Option("BASICS IN PHARMACEUTICAL TECHNOLOGY","BASICS IN PHARMACEUTICAL TECHNOLOGY");
		 document.formname.subcategory1.options[3]=new Option("DISPENSING PHARMACY","DISPENSING PHARMACY");
		 document.formname.subcategory1.options[4]=new Option("PHARMACOGNOSY-I","PHARMACOGNOSY-I");
		 document.formname.subcategory1.options[5]=new Option("EVIDENCE BASED PHARMACY","EVIDENCE BASED PHARMACY");
		 break;
		 
     case "Mechenical" :
		 
    	 document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option("Mathematics -I","Mathematics -I");
		 document.formname.subcategory1.options[2]=new Option("Electrical Technology","Electrical Technology");
		 document.formname.subcategory1.options[3]=new Option("Intro. To Manufact. Proc and WSP","Intro. To Manufact. Proc and WSP");
		 document.formname.subcategory1.options[4]=new Option("Programming and Data struct","Programming and Data struct");
		 document.formname.subcategory1.options[5]=new Option("Programming and Data Struct Lab","Programming and Data Struct Lab");
		 break;
       case "Civil" :
		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
		 document.formname.subcategory1.options[1]=new Option(" Foundations of Engineering"," Foundations of Engineering");
		 document.formname.subcategory1.options[2]=new Option("Engineering Mathematics 1A","Engineering Mathematics 1A");
		 document.formname.subcategory1.options[3]=new Option("Mathematical Modelling and Computation","Mathematical Modelling and Computation");
		 document.formname.subcategory1.options[4]=new Option("Engineering Mechanics","Engineering Mechanics");
		 document.formname.subcategory1.options[5]=new Option("Chemical Principles and Processes","Chemical Principles and Processes");
		 break;
       
       case "Electrical & Electronics" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("Engineering Drawing","Engineering Drawing");
  		 document.formname.subcategory1.options[2]=new Option("Manufacturing Processes","Manufacturing Processes");
  		 document.formname.subcategory1.options[3]=new Option("Principles of Electrical Engineering","Principles of Electrical Engineering");
  		 document.formname.subcategory1.options[4]=new Option("Applied Mechanics","Applied Mechanics");
  		 document.formname.subcategory1.options[5]=new Option("Mathematics II","Mathematics II");
  		 break;
  	
       case "Information Technology" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("Programming and Data Structures","Programming and Data Structures");
  		 document.formname.subcategory1.options[2]=new Option("Algoritham","Algoritham");
  		 document.formname.subcategory1.options[3]=new Option("Theory of Computation","Theory of Computation");
  		 document.formname.subcategory1.options[4]=new Option("Compiler Design","Compiler Design");
  		 document.formname.subcategory1.options[5]=new Option("Operating System","Operating System");
  		 break;
       case "Computer Science" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option(" Fluency In Information Technology "," Fluency In Information Technology ");
  		 document.formname.subcategory1.options[2]=new Option("Computer Science Principles","Computer Science Principles");
  		 document.formname.subcategory1.options[3]=new Option("Science and Art of Digital Photography","Science and Art of Digital Photography");
  		 document.formname.subcategory1.options[4]=new Option(" Data Programming"," Data Programming");
  		 document.formname.subcategory1.options[5]=new Option(" Computer Programming "," Computer Programming ");
  		 break;
  	
       case "Maths" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option(" Physics "," Physics");
    		 document.formname.subcategory1.options[2]=new Option("Chemestry","Chemestry");
    		 document.formname.subcategory1.options[3]=new Option("Hindi","Hindi");
    		 document.formname.subcategory1.options[4]=new Option(" General English"," General English");
    		 document.formname.subcategory1.options[5]=new Option(" Alzebra "," Alzebra ");
    		 break;
    	
       case "BIO" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option(" Fundamentals of Microbiology "," Fundamentals of Microbiology");
  		 document.formname.subcategory1.options[2]=new Option("Physical and Chemical aspects of Biochemistry","Physical and Chemical aspects of Biochemistry");
  		 document.formname.subcategory1.options[3]=new Option("Biomolecules","Biomolecules");
  		 document.formname.subcategory1.options[4]=new Option(" Microbial Diversity"," Microbial Diversity");
  		 document.formname.subcategory1.options[5]=new Option(" Environmental Biotechnology "," Environmental Biotechnology ");
  		 break;
  	
       case "Micro Biology" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option(" Microbial Chemistry and Physiology "," Microbial Chemistry and Physiology");
    		 document.formname.subcategory1.options[2]=new Option("Biomolecules","Biomolecules");
    		 document.formname.subcategory1.options[3]=new Option("Environmental Biotechnology","Environmental Biotechnology");
    		 document.formname.subcategory1.options[4]=new Option(" Applied Microbiology"," Applied Microbiology");
    		 document.formname.subcategory1.options[5]=new Option(" Prokaryotic Metabolism "," Prokaryotic Metabolism ");
    		 break;
	   
    		 
       case "Home Science" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option(" Microbial Chemistry and Physiology "," Microbial Chemistry and Physiology");
  		 document.formname.subcategory1.options[2]=new Option("Foods and Nutrition","Foods and Nutrition");
  		 document.formname.subcategory1.options[3]=new Option("Clothing and textiles","Clothing and textiles");
  		 document.formname.subcategory1.options[4]=new Option("  Home Science  Extension Education","  Home Science  Extension Education");
  		 document.formname.subcategory1.options[5]=new Option(" Home Management/  Family Resource  Management "," Home Management/  Family Resource  Management ");
  		 break;
      
       case "Risk Management" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option(" Employee Benefit Planning "," Employee Benefit Planning");
    		 document.formname.subcategory1.options[2]=new Option("Risk Management Modeling","Risk Management Modeling");
    		 document.formname.subcategory1.options[3]=new Option("Perspectives on Risk and Insurance","Perspectives on Risk and Insurance");
    		 document.formname.subcategory1.options[4]=new Option(" Pension Planning","  Pension Planning");
    		 document.formname.subcategory1.options[5]=new Option(" Insurance Law "," Insurance Law ");
    		 break;
	
    		 
       case "Human Resource (HR) Management" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option(" Organizational Behavior "," Organizational Behavior");
  		 document.formname.subcategory1.options[2]=new Option("Labor Legislation","Labor Legislation");
  		 document.formname.subcategory1.options[3]=new Option("Training and Development","Training and Development");
  		 document.formname.subcategory1.options[4]=new Option(" Strategic HRM","  Strategic HRM");
  		 document.formname.subcategory1.options[5]=new Option(" Global HRM "," Global HRM ");
  		 break;
  		 
       case "Tourism Management" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option(" Tourism Principles, Policies and Practices ","Tourism Principles, Policies and Practices");
    		 document.formname.subcategory1.options[2]=new Option("Economics of Tourism","Economics of Tourism");
    		 document.formname.subcategory1.options[3]=new Option("Tourism Marketing","Tourism Marketing");
    		 document.formname.subcategory1.options[4]=new Option(" Socially Oriented Course"," Socially Oriented Course");
    		 document.formname.subcategory1.options[5]=new Option(" Computer Application in Tourism "," Computer Application in Tourism ");
    		 break;
    		 
       case "Finance Management" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option(" Principles of Management ","Principles of Management");
  		 document.formname.subcategory1.options[2]=new Option("Financial Accounting","Financial Accounting");
  		 document.formname.subcategory1.options[3]=new Option("Managerial Economics","Managerial Economics");
  		 document.formname.subcategory1.options[4]=new Option(" Business Communication"," Business Communication");
  		 document.formname.subcategory1.options[5]=new Option(" Human Resources Management "," Human Resources Management");
  		 break;
      
       case "Mechnical" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option(" Thermal Science and Engineering ","Thermal Science and Engineering");
    		 document.formname.subcategory1.options[2]=new Option("Mechanics of Fluids","Mechanics of Fluids");
    		 document.formname.subcategory1.options[3]=new Option("Managerial Economics","Managerial Economics");
    		 document.formname.subcategory1.options[4]=new Option(" Refrigeration and Air-conditioning"," Refrigeration and Air-conditioning");
    		 document.formname.subcategory1.options[5]=new Option(" Design of Machine Tools ","Design of Machine Tools");
    		 break;
       
       case "Computer Application" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option(" Mathematical Foundation of Computer Science  ","Mathematical Foundation of Computer Science ");
  		 document.formname.subcategory1.options[2]=new Option("Computer Organization ","Computer Organization");
  		 document.formname.subcategory1.options[3]=new Option("Combinatorics & Graph Theory","Combinatorics & Graph Theory");
  		 document.formname.subcategory1.options[4]=new Option("Operating System","Operating System");
  		 document.formname.subcategory1.options[5]=new Option("Internet & JAVA Programming","Internet & JAVA Programming");
  		document.formname.subcategory1.options[6]=new Option("Software Engineering","Software Engineering");
 		 document.formname.subcategory1.options[7]=new Option("Net Frame Work & C# ","Net Frame Work & C# ");
  		 break;
  		 
       case "Bio-Technology" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Mathematics-1 ","Mathematics-1 ");
    		 document.formname.subcategory1.options[2]=new Option("Basic Engineering-I (Civil and Mech.)","Basic Engineering-I (Civil and Mech.)");
    		 document.formname.subcategory1.options[3]=new Option("Biochemistry","Biochemistry");
    		 document.formname.subcategory1.options[4]=new Option("Value education ","Value education ");
    		 document.formname.subcategory1.options[5]=new Option("Microbiology","Microbiology");
    		document.formname.subcategory1.options[6]=new Option("Mechanical operations & heat transfer ","Mechanical operations & heat transfer ");
   		 document.formname.subcategory1.options[7]=new Option("Physics of Protein-DNA Interaction ","Physics of Protein-DNA Interaction ");
    		 break;
    		 
       case "B-Tech Agriculture" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("Engg. Maths-I  ","Engg. Maths-I  ");
  		 document.formname.subcategory1.options[2]=new Option("Agriculture for Engineers","Agriculture for Engineers");
  		 document.formname.subcategory1.options[3]=new Option("Engg. Physics","Engg. Physics");
  		 document.formname.subcategory1.options[4]=new Option("Environmental & Ecology ","Environmental & Ecology");
  		 document.formname.subcategory1.options[5]=new Option("Fundamentals of Computer Programming ","Fundamentals of Computer Programming ");
  		document.formname.subcategory1.options[6]=new Option("Surveying & Leveling","Surveying & Leveling");
 		 document.formname.subcategory1.options[7]=new Option("Temporary and Permanent hardness","Temporary and Permanent hardness");
  		 break;
  		 
       case "Aeronautical Engineering" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Computer Literacy","Computer Literacy");
    		 document.formname.subcategory1.options[2]=new Option("Personality Development","Personality Development");
    		 document.formname.subcategory1.options[3]=new Option(" Biology for Engineers"," Biology for Engineers");
    		 document.formname.subcategory1.options[4]=new Option("Environmental & Ecology ","Environmental & Ecology");
    		 document.formname.subcategory1.options[5]=new Option("Manufacturing Process Laboratory","Manufacturing Process Laboratory");
    		document.formname.subcategory1.options[6]=new Option("Aerodynamics – II","Aerodynamics – II");
   		 document.formname.subcategory1.options[7]=new Option("P Elective IV ","P Elective IV ");
    		 break;
    		 
       case "Architecture" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("Computer Literacy","Computer Literacy");
  		 document.formname.subcategory1.options[2]=new Option("Personality Development","Personality Development");
  		 document.formname.subcategory1.options[3]=new Option("GERMAN LANGUAGE PHASE II"," GERMAN LANGUAGE PHASE II");
  		 document.formname.subcategory1.options[4]=new Option("STRUCTURAL ANALYSIS  ","STRUCTURAL ANALYSIS ");
  		 document.formname.subcategory1.options[5]=new Option("HISTORY OF ARCHITECTURE-II ","HISTORY OF ARCHITECTURE-II ");
  		document.formname.subcategory1.options[6]=new Option("BASIC DESIGN & MODEL MAKING ","BASIC DESIGN & MODEL MAKING ");
 		 document.formname.subcategory1.options[7]=new Option("TIMBER & STEEL STRUCTURES ","TIMBER & STEEL STRUCTURES  ");
  		 break;
  	
    		 
       case "Banking & Finance" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("Acounting","Acounting");
  		 document.formname.subcategory1.options[2]=new Option("budgeting","budgeting");
  		 document.formname.subcategory1.options[3]=new Option(" Asset management(finance)"," Asset management(finance)");
  		 document.formname.subcategory1.options[4]=new Option("investments ","investments");
  		 document.formname.subcategory1.options[5]=new Option("financial transsaction","financial transsaction");
  		document.formname.subcategory1.options[6]=new Option("csh flow manager ","csh flow manager ");
 		 document.formname.subcategory1.options[7]=new Option("managing fixed assets, ","managing fixed assets, ");
  		 break;
  		 
       case "Statistics" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Design and robustnessy","Design and robustness");
    		 document.formname.subcategory1.options[2]=new Option("Advanced Probability","Advanced Probability");
    		 document.formname.subcategory1.options[3]=new Option(" Consulting"," Consulting");
    		 document.formname.subcategory1.options[4]=new Option("Linear Programming ","Linear Programming");
    		 document.formname.subcategory1.options[5]=new Option("Models in Operations Research","Models in Operations Research");
    		document.formname.subcategory1.options[6]=new Option("Applied statistics","Applied statistics");
   		 document.formname.subcategory1.options[7]=new Option("Probability ","Probability ");
    		 break;
    		 
       case "Finance and Taxation" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("International Business Finance","International Business Finance");
  		 document.formname.subcategory1.options[2]=new Option("Organization Theory and Behavior","Organization Theory and Behavior");
  		 document.formname.subcategory1.options[3]=new Option(" Business Environment"," Business Environment");
  		 document.formname.subcategory1.options[4]=new Option("Marketing Management ","Marketing Management");
  		 document.formname.subcategory1.options[5]=new Option(" Research Methodology and Statistical Analysis"," Research Methodology and Statistical Analysis");
  		
  		 break;
       
       case "Finance Managment" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("‐ Individual Dimensions of O.B","‐ Individual Dimensions of O.B");
    		 document.formname.subcategory1.options[2]=new Option("Organisational Behaviour","Organisational Behaviour");
    		 document.formname.subcategory1.options[3]=new Option(" Business Cycles"," Business Cycles");
    		 document.formname.subcategory1.options[4]=new Option("Inflation ","Inflation");
    		 document.formname.subcategory1.options[5]=new Option("Elasticity of Demandh","Elasticity of Demand");
    		document.formname.subcategory1.options[6]=new Option("Production Theory","Production Theory");
   		 document.formname.subcategory1.options[7]=new Option("Theory of Costs","Theory of Costs ");
    		 break;
    		 
       case "CS" :
  		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
  		 document.formname.subcategory1.options[1]=new Option("Banking Theory, Law and Practice","Banking Theory, Law and Practice");
  		 document.formname.subcategory1.options[2]=new Option("Nature and scope of business","Nature and scope of business");
  		 document.formname.subcategory1.options[3]=new Option(" Financing of companies "," Financing of companies ");
  		 document.formname.subcategory1.options[4]=new Option("ADVANCED ACCOUNTING ","ADVANCED ACCOUNTING");
  		 document.formname.subcategory1.options[5]=new Option("RELATIONAL DATABASE MANAGEMENT SYSTEMS ","RELATIONAL DATABASE MANAGEMENT SYSTEMS ");
  		document.formname.subcategory1.options[6]=new Option("E-COMMERCE (wef 20011-’12)","E-COMMERCE (wef 20011-’12)");
 		 document.formname.subcategory1.options[7]=new Option("BUSINESS LAW ","BUSINESS LAW ");
  		 break;
  		 
       case "Cs&IT" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Principles of Compiler Design-I","Principles of Compiler Design-I");
    		 document.formname.subcategory1.options[2]=new Option("Digital Signal Processing-I","Digital Signal Processing-I");
    		 document.formname.subcategory1.options[3]=new Option(" Mobile Computing"," Mobile Computing");
    		 document.formname.subcategory1.options[4]=new Option("Linear Programming ","Linear Programming");
    		 document.formname.subcategory1.options[5]=new Option("Data Warehousing and Mining","Data Warehousing and Mining");
    		document.formname.subcategory1.options[6]=new Option("Artificial Intelligence","Artificial Intelligence");
   		 document.formname.subcategory1.options[7]=new Option("3 Enterprise Networking  ","3 Enterprise Networking  ");
    		 break;
    		 
       case "Math" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Real Analysis ","Real Analysis ");
    		 document.formname.subcategory1.options[2]=new Option("Algebra","Algebra");
    		 document.formname.subcategory1.options[3]=new Option(" Mechanics"," Mechanics");
    		 document.formname.subcategory1.options[4]=new Option("Advanced Analysis ","Advanced Analysis");
    		 document.formname.subcategory1.options[5]=new Option("Numerical Analysis","Numerical Analysis");
    		document.formname.subcategory1.options[6]=new Option("Group Theory ","Group Theory ");
   		 document.formname.subcategory1.options[7]=new Option("Computer Applications  ","Computer Applications  ");
    		 break;
    		 
       case "Chemistry" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Inorganic Chemistry.-I ","Inorganic Chemistry.-I ");
    		 document.formname.subcategory1.options[2]=new Option("Organaic Chemistry.-I ","Organaic Chemistry.-I ");
    		 document.formname.subcategory1.options[3]=new Option(" Analytical Chemistry-I"," Analytical Chemistry-I");
    		 document.formname.subcategory1.options[4]=new Option(" Physical Chemistry amming "," Physical Chemistry ");
    		 break;
    		 
       case "Physics" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Mathematical Methods I","Mathematical Methods I");
    		 document.formname.subcategory1.options[2]=new Option("Classical Mechanics ","Classical Mechanics ");
    		 document.formname.subcategory1.options[3]=new Option(" Atomic Spectroscopy "," Atomic Spectroscopy ");
    		 document.formname.subcategory1.options[4]=new Option("Relativity and Cosmology","Relativity and Cosmology");
    		 document.formname.subcategory1.options[5]=new Option(" Solid State Physics II"," Solid State Physics II");
    		document.formname.subcategory1.options[6]=new Option(" Group Theory"," Group Theory");
   		 document.formname.subcategory1.options[7]=new Option(" Astrophysics  "," Astrophysics  ");
    		 break;
    		 
       case "Accounting and Finance" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Design and robustnessy","Design and robustness");
    		 document.formname.subcategory1.options[2]=new Option("Business Statistics ","Business Statistics ");
    		 document.formname.subcategory1.options[3]=new Option(" Business Environment"," Business Environment");
    		 document.formname.subcategory1.options[4]=new Option("Business Finance ","Business Finance");
    		 document.formname.subcategory1.options[5]=new Option("Auditing","Auditing");
    		document.formname.subcategory1.options[6]=new Option("Applied statistics","Applied statistics");
   		 document.formname.subcategory1.options[7]=new Option("Accounting for Managerial Decisions ","Accounting for Managerial Decisions ");
    		 break;
    		 
       case "Computers" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option(" Business Economics"," Business Economics");
    		 document.formname.subcategory1.options[2]=new Option(" Quantitative Techniques"," Quantitative Techniques");
    		 document.formname.subcategory1.options[3]=new Option(" Advanced Accounting"," Advanced Accounting");
    		 document.formname.subcategory1.options[4]=new Option(" Corporate Accounting "," Corporate Accounting");
    		 document.formname.subcategory1.options[5]=new Option("Business Law","Business Law");
    		document.formname.subcategory1.options[6]=new Option("Cost & Management Accounting","Cost & Management Accounting");
   		 document.formname.subcategory1.options[7]=new Option("Web Programming ","Web Programming ");
    		 break;
    		 
       case "Honors" :
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("SPECIALIZED ACCOUNTING","SPECIALIZED ACCOUNTING");
    		 document.formname.subcategory1.options[2]=new Option("PUBLIC FINANC","PUBLIC FINANCE");
    		 document.formname.subcategory1.options[3]=new Option(" INDUSTRIAL PSYCHOLOGY"," INDUSTRIAL PSYCHOLOGY");
    		 document.formname.subcategory1.options[4]=new Option("BUSINESS COMMUNICATION ","BUSINESS COMMUNICATION");
    		 document.formname.subcategory1.options[5]=new Option("BUSINESS STATISTICS","BUSINESS STATISTICS");
    		document.formname.subcategory1.options[6]=new Option("BUSINESS ENVIRONMENT","BUSINESS ENVIRONMENT");
   		 
    		 break;
    		 
       case "(Hons) Marketing" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Financial Accounting I ","Financial Accounting I ");
    		 document.formname.subcategory1.options[2]=new Option("Business Regulatory Framework ","Business Regulatory Framework ");
    		 document.formname.subcategory1.options[3]=new Option(" Economics I "," Economics I ");
    		 document.formname.subcategory1.options[4]=new Option("Business Mathematics & Statistics ","Business Mathematics & Statistics");
    		 document.formname.subcategory1.options[5]=new Option("Direct & Indirect Taxation ","Direct & Indirect Taxation ");
    		document.formname.subcategory1.options[6]=new Option("Cost & Management Accounting ","Cost & Management Accounting ");
   		 document.formname.subcategory1.options[7]=new Option("Environmental Studies  ","Environmental Studies  ");
    		 break;
    		 
       case "History" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("History of India-I","History of India-I");
    		 document.formname.subcategory1.options[2]=new Option(" Concurrent – Qualifying Language "," Concurrent – Qualifying Language ");
    		 document.formname.subcategory1.options[3]=new Option("  Rise of Modern West-I","  Rise of Modern West-I");
    		 document.formname.subcategory1.options[4]=new Option("History of India-V (c. 1550-1605) ","History of India-V (c. 1550-1605) ");
    		 document.formname.subcategory1.options[5]=new Option("History of India-VIII (c. 1857-1950) ","History of India-VIII (c. 1857-1950) ");
    		document.formname.subcategory1.options[6]=new Option("History of China & Japan – I (c. 1840-1949)","History of China & Japan – I (c. 1840-1949)");
   		 
    		 break;
    		 
       case "Sociology" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Introduction to Sociology","Introduction to Sociology");
    		 document.formname.subcategory1.options[2]=new Option("Society in India: Structure and Change","Society in India: Structure and Change");
    		 document.formname.subcategory1.options[3]=new Option("  Indian Society: Issues and Problems","  Indian Society: Issues and Problems");
    		 document.formname.subcategory1.options[4]=new Option(" Social Research Methods "," Social Research Methods");
    		 document.formname.subcategory1.options[5]=new Option(" Foundations of Sociological Thought "," Foundations of Sociological Thought ");
  
  
    		 break;
    		 
       case "Journalism & Mass Communication" :
    		 
    	   document.formname.subcategory1.options[0]=new Option("...select subject...","");
    		 document.formname.subcategory1.options[1]=new Option("Human Communication","Human Communication");
    		 document.formname.subcategory1.options[2]=new Option("Mass Communication","Mass Communication");
    		 document.formname.subcategory1.options[3]=new Option(" News Writing"," News Writing");
    		 document.formname.subcategory1.options[4]=new Option("Reporting ","Reporting");
    		 document.formname.subcategory1.options[5]=new Option("Media Issues","Media Issues");
    		document.formname.subcategory1.options[6]=new Option("Writing Skills","Writing Skills");
   		 document.formname.subcategory1.options[7]=new Option("Social Sciences - Sociology & Psychology ","Social Sciences - Sociology & Psychology ");
    		 break;
     
       case "Others":
    	   
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
 
 
 
 
   <script language="javascript" type="text/javascript">
 
 function dropdownlist4(listindex)
 { 
	document.formname.city.options.length = 0;
 	switch (listindex)
 	{
 
	 case "MP" :
	 document.formname.city.options[0]=new Option(".....Select....","");	 
	 document.formname.city.options[1]=new Option("Anuppur","Anuppur");
	 document.formname.city.options[2]=new Option("Ashoknagar","Ashoknagar");
	 document.formname.city.options[3]=new Option("Betul","Betul");
	 document.formname.city.options[4]=new Option("Bhind","Bhind");
	 document.formname.city.options[5]=new Option("Bhopal","Bhopal");
	 document.formname.city.options[6]=new Option("Chhatarpur","Chhatarpur");
	 document.formname.city.options[7]=new Option("Datia","Datia");
	 document.formname.city.options[8]=new Option("Dewas","Dewas");
	 document.formname.city.options[9]=new Option("Guna","Guna");
	 document.formname.city.options[10]=new Option("Gwalior","Gwalior");
	 document.formname.city.options[11]=new Option("Indore","Indore");
	 document.formname.city.options[12]=new Option("Jabalpur","Jabalpur");
	 document.formname.city.options[13]=new Option("Khandwa","Khandwa");
	 document.formname.city.options[14]=new Option("Mandsaur","Mandsaur");
	 document.formname.city.options[15]=new Option("Neemuch","Neemuch");
	 document.formname.city.options[16]=new Option("Rewa","Rewa");
	 document.formname.city.options[17]=new Option("Sagar","Sagar");
	 document.formname.city.options[18]=new Option("Shivpuri","Shivpuri");
	 document.formname.city.options[19]=new Option("Ujjan","Ujjan");
	 document.formname.city.options[20]=new Option("Vidisha","Vidisha"); 
	break;
 case "UP" :
	 document.formname.city.options[0]=new Option(".....Select....","");
	 document.formname.city.options[1]=new Option("Agra","Agra")
	 document.formname.city.options[2]=new Option("Allahabad","Allahabad");
	 document.formname.city.options[3]=new Option("Banda","Banda");
	 document.formname.city.options[4]=new Option("Chitrakoot","Chitrakoot");
	 document.formname.city.options[5]=new Option("Fatehpur","Fatehpur");
	 document.formname.city.options[6]=new Option("Jhansi","Jhansi");
 break;
 case "RJ" :
	 document.formname.city.options[0]=new Option(".....Select....","");
	 document.formname.city.options[1]=new Option("Ajmer","Ajmer");
	 document.formname.city.options[2]=new Option("Jodhpur","Jodhpur");
	 document.formname.city.options[3]=new Option("Jaipur","Jaipur");
	 document.formname.city.options[4]=new Option("Kota","Kota");
	 document.formname.city.options[5]=new Option("Fatehpur","Fatehpur");
	 document.formname.city.options[6]=new Option("Udaipur","Udaipur");
 break;
 case "Delhi" :
	 document.formname.city.options[0]=new Option(".....Select....","");
	 document.formname.city.options[1]=new Option("Central Delhi","Central Delhi");
	 document.formname.city.options[2]=new Option("East Delhi","East Delhi");
	 document.formname.city.options[3]=new Option("New Delhi","New Delhi");
	 document.formname.city.options[4]=new Option("North Delhi","North Delhi");
	 document.formname.city.options[5]=new Option("South Delh","South Delh");
	 document.formname.city.options[6]=new Option("West Delhi","West Delhi");
 break;

 }
 return true;
 }
 </script> 
</head>
<body  body background="ab.jpg">
<div class="header">
<center><%@include file="header.jsp" %></center>
</div>
<div class="menu2">
<table border="12" width="100%" height="60px">
<tr><td align="center"><a href="home.jsp" style="text-decoration: none;">Home</a></td><td align="center"><a href="about.jsp" style="text-decoration: none;">About Us</a></td><td align="center"><a href="contact.jsp" style="text-decoration: none;">Contact Us</a></td><td align="center"><a href="logout.jsp" style="text-decoration: none;">Logout</a></td></tr>
</table>
</div>

<div class="head" align="center">

</div>
<div align="center">
<font color="red">
<% String ss=(String)request.getAttribute("msg");
 if(ss!=null)
	 out.println(ss);
%>
</font></div>
<form id="formname" name="formname"  action="buy_controller"   method="get"  enctype="multipart/form-data">
 <table width="600" height="250" border="7" align="center">
<tr><th colspan="3" ><marquee>Books Buy</marquee></th></tr> >
 <tr>
      <td width="21%" align="right" valign="middle"><p align="center">Course :</p></td>
      <td width="79%" align="left" valign="middle"><div align="center">
          <select  style="width:55%;height:10%;" size="1"  name="category" id="category"      onChange="javascript: dropdownlist(this.options[this.selectedIndex].value);"   required="required">
            <option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select Course</option>
                <option value="B.Tech">B.Tech</option>
              <option value="B.E">B.E</option>
            <option value="B.A">B.A</option>
          <option value="B.Sc">B.Sc</option>
            <option value="B.COM">B.Com</option>
 	   	 <option value="MBBS">MBBS</option>
                 <option value="MBA">MBA</option>
                   <option value="MCA">MCA</option>
                   <option value="M.Sc">M.Sc</option>
               <option value="M.Com">M.Com</option>
               <option value="Ph.D.">Ph.D.</option>
                
                                
          </select>
      </div></td>
    </tr>
    <tr>
      <td align="right" valign="middle"><div align="center">Stream : </div></td>
      <td align="left" valign="middle"><div align="center">
          <script type="text/javascript" language="JavaScript">
 document.write('<select style="width:55%;height:10%;" size="1" name="subcategory" id="subcategory" required="required" onchange="javascript: dropdownlist1(this.options[this.selectedIndex].value);"><option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select Stream</option></select>')
 
  </script>
          <noscript>
          <select name="subcategory" id="subcategory" >
            <option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select Stream</option>
          </select>
          </noscript>
      </div></td>
    </tr>
    <tr>
      <td align="right" valign="middle"><div align="center">Subject : </div></td>
      <td align="left" valign="middle"><div align="center">
          <script type="text/javascript" language="JavaScript">
 document.write('<select style="width:55%;height:10%;" size="1" name="subcategory1"><option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;select subject</option></select>')
  </script>
          <noscript>
          <select name="subcategory1" id="subcategory1" >
            <option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select Subject</option>
          </select>
          </noscript>
      </div></td>
    </tr>
 <tr>
  <td align="right" valign="middle"><div align="center">State : </div></td>
 <td align="left" valign="middle"><div align="center"><select style="width:55%;height:10%;" name="state" id="state"   required="required"      onchange="javascript: dropdownlist4(this.options[this.selectedIndex].value);">
 <option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select state</option>
 <option value="MP">Madhya Pradesh(MP)</option>
 <option value="UP">Uttar Pradesh(UP)</option>
 <option value="RJ">Rajasthan(RJ)</option>
 <option value="Delhi">Delhi(DL)</option>
 
 </select></td>
 </tr>
 <tr> <td align="right" valign="middle"><div align="center">City : </div></td>

 <td align="left" valign="middle"><div align="center"><script type="text/javascript" language="JavaScript">
 document.write('<select style="width:55%;height:10%;" name="city" id="city" required="required" onchange="javascript: dropdownlist3(this.options[this.selectedIndex].value);"><option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select city</option></select>')
 </script>
 <noscript><select name="city" id="city" >
 <option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Select city</option>
 </select>
 </noscript></td>
 </tr>
 <tr>
 
 </select>
 </noscript>
 </td>
 </tr>
 <tr>
 <td colspan="2" align="center" width="38" align="center">
<input style="left: " type="submit"value="Search"></td>

</tr>
 </table>


<div class="footer">
<center><%@include file="footer.jsp" %></center>
</div>
</form>
</body>
</html>
<%}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	request.setAttribute("key","you are not login first you have to login");
	rd.include(request, response);
}
%>

 