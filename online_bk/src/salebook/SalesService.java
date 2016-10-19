package salebook;



public class SalesService {
public boolean cheak_Sales_Detail(SalesDto sdto)
{ 
	if((sdto.getWriter_name().length()==0))
	{
		return true;
		
	}
	else if(sdto.getBook_name().length()==0)
	{
		return true;
	}
	else if(sdto.getCourse_subject().length()==0)
	{
		return true;
	}
	else if(sdto.getCourse_Stream().length()==0)
	{
		return true;
	}
	
	else if(sdto.getNegotiable_status().length()==0)
	{
		return true;
	}
	else if(sdto.getEdition().length()==0)
	{
		return true;
	}
	else if(sdto.getPrice().length()==0)
	{
		return true;
	}
	else if(sdto.getEmail().length()==0)
	{
		return true;
	}
	else if(sdto.getBook_description().length()==0)
	{
		return false;
	}
	SalesDao s=new SalesDao();
	s.insert_sales_Details( sdto);
	return false;
	
}

public boolean check(SalesDto sdto) {
	boolean b=false;
	
	if(!(sdto.getFile_path().equals("null")))
	{  
		
		SalesDao da=new SalesDao();
	b=true;
		
	

	}
	if(b==true)
	{
		return true;
	}
	else
	{
	return false;
	}
}
	
}

