package shareevent;
import java.util.ArrayList;
import salebook.SalesDao;
public class EventService {
public boolean check_EventDetail(EventDto ed) throws Exception
{if(ed.getEvent_description().startsWith(" "))
{return true;
	
} if(ed.getEvent_name().startsWith(" "))
	
{
	return true;
}
EventDao s=new EventDao();
s.insert_Event_Details(ed);
	return false;
	
}
public boolean check(EventDto e) {
	boolean b=false;
	
	if(!(e.getFile_path().equals("null")))
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
public ArrayList<EventDto> view_event_service() throws Exception 
{ 
	ArrayList<EventDto> al=new ArrayList<EventDto>();
EventDao ed=new EventDao();
	al=ed.veiw_Event_Detail();
	return al;
	}

public boolean delete_event_info(String event_id)
{
	EventDao ed=new EventDao();
	return ed.delete_event_infodao(event_id);
}
public boolean disable_event_info(String event_id) {
	
	EventDao ed=new EventDao();
	return ed.update_disable_status(event_id);
}
public boolean enable_event_info(String event_id)
{
	EventDao ed=new EventDao();
	return ed.update_event_status(event_id);
	
}
public ArrayList<EventDto> view_userevent_service() {
	ArrayList<EventDto> al=new ArrayList<EventDto>();
	EventDao ed=new EventDao();
		al=ed.veiw_UserEvent_Detail();
		return al;
	
}
}
