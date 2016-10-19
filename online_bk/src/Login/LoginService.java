package Login;



public class LoginService {



	public String check(LoginDto sd) {
		if((sd.getUserId().length()==0))
			return "Please Enter email";		
			else if((sd.getPassword().length()==0))
			{
				return "Please Enter Password";
			}
	  
		else
		{
	     		LoginDao d=new LoginDao();
				String s1=d.loginInsert(sd);
				return s1;
			
		}
	
		
	}
	public String username(LoginDto sd)
	{
		LoginDao d=new LoginDao();
		String username=d.username(sd);
		return username;
	}

}
