package admin_login;

import java.util.ArrayList;

public class Admin_Service {

		ArrayList al=new ArrayList();
		public ArrayList fatch()
		{
			
			Admin_Dao d1=new Admin_Dao();
			al=d1.fatch();
			return al;	
			
		}
		
			ArrayList al1=new ArrayList();
			public ArrayList admin_Check()
			{
				
				Admin_Dao d2=new Admin_Dao();
				al1=d2.admin_Check();
				return al1;	
				
			}
			
		
		

	}



