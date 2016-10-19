package pending;


public class pending_status_enableService {
	public boolean enable(pending_status_Dto psd)
	{
	 pending_status_enableDao p=new pending_status_enableDao();
	   boolean b= p.enable(psd);
	   if(b==true)
		   return true;
	   else
		   return false;

	}
}
