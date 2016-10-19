package buy;

import java.util.ArrayList;

public class buy_Service {
	public boolean buySearch(buy_Dto bd)
		{
		if(bd.getCity().length()==0||bd.getCourse().length()==0||bd.getSubject().length()==0||bd.getState().length()==0)
		{
			return false;
		}
		else
		{
			buy_Dao bs=new buy_Dao();
			bs.bookSearch(bd);
			return true;	
		}
		
	}
	public ArrayList<buy_Dto> getSearch(buy_Dto bd)
	{

		buy_Dao bs=new buy_Dao();
		ArrayList al=bs.bookSearch(bd);
		return al;	
	}

	
	
	
	
	public ArrayList<buy_Dto> sallerDetails(buy_Dto bd)
	{
	if(bd.getSaler_email()==null)
	{
		ArrayList<buy_Dto> aa=null;
		return aa;
	}
	else
	{
		buy_Dao bs=new buy_Dao();
		ArrayList al=bs.sellerDetailsDao(bd);
		return al;	
	}
	
}
	
}	


