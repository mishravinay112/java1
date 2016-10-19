package Registration;
import java.sql.SQLException;
public class RegistrationService {
	public String insertService(RegistrationDto registration_Dto ) throws Exception
	{
		
		String emailpattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		//System.out.println("inside service");
		if(registration_Dto.getUser_name()==""||(registration_Dto.getUser_name().length()==0)||!(registration_Dto.getUser_name().matches(".*[A-Za-z].*"))){
			System.out.println("1");
			return registration_Dto.getUser_name() ;
		}
		else if(registration_Dto.getUser_password()==""||(registration_Dto.getUser_password().length()==0)){
			System.out.println("2");
			return registration_Dto.getUser_password();
		}
		
		else if(!(registration_Dto.getEmail().matches(emailpattern))){
			System.out.println("3");	
			return registration_Dto.getEmail();
		}
		else if(!(registration_Dto.getMobile().matches("[987][0-9]{9}"))){
			System.out.println("4");
			return registration_Dto.getMobile();
		}
		else if(registration_Dto.getCollege()==""||(registration_Dto.getCollege().length()==0)){
			System.out.println("5");
			return registration_Dto.getCollege();
	        }
		else if(registration_Dto.getState()==""||(registration_Dto.getState().length()==0)){
			System.out.println("6");
			return registration_Dto.getState();
        }
		else if(registration_Dto.getCity()==""||(registration_Dto.getCity().length()==0)){
			System.out.println("7");
			return registration_Dto.getCity();
	    }
		else if(registration_Dto.getArea()==""||(registration_Dto.getArea().length()==0)){
			System.out.println("8");
			return registration_Dto.getArea();
	    }
		else if(registration_Dto.getAddress()==""||(registration_Dto.getAddress().length()==0)){
			System.out.println("9");
			return registration_Dto.getAddress();
	    }
			
		else if(registration_Dto.getPincode()==""||(registration_Dto.getPincode().length()<6)){
			System.out.println("10");
			return registration_Dto.getPincode();
	    }
		else if(registration_Dto.getGender()==""){
			System.out.println("11");
			return registration_Dto.getGender();
	    }
		
		boolean b1=false;
		try{
			RegistrationDao rd=new RegistrationDao();
			b1=rd.insert(registration_Dto);
		}catch(Exception e)
		{
			throw new Exception(e);
		}
		
		if(b1==true)
		{
		return "true";
		}
		else
		{
			return "false";	
		}
	
		
	}
	public int fatch(RegistrationDto registration_Dto ) throws ClassNotFoundException, SQLException
	{
		RegistrationDao rd1=new RegistrationDao();
		int id=rd1.fatch(registration_Dto);
		return id;
	}
	
	
	

}
