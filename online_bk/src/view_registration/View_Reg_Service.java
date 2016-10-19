package view_registration;

import java.util.ArrayList;

public class View_Reg_Service {
	public ArrayList<View_Reg_Dto> view_Reg_Service() throws ClassNotFoundException
	{ 
		ArrayList<View_Reg_Dto> al=new ArrayList<View_Reg_Dto>();
		View_Reg_Dao vrs=new View_Reg_Dao();
		al=vrs.view_Reg_Dao();
		return al;


}
	public String deletetRegService(String emailid){
		View_Reg_Dao vrd=new View_Reg_Dao();
		return vrd.deleteRegDao(emailid);
		
		
	}
}
