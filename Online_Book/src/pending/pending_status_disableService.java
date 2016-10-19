package pending;



public class pending_status_disableService {
public boolean disable(pending_status_Dto psd)
{
 pending_status_disableDao p=new pending_status_disableDao();
   boolean b= p.disable(psd);
   if(b==true)
	   return true;
   else
	   return false;

}
}
