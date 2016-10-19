package shareevent;

import java.sql.Date;

public class EventDto {
	private Date eventdate;
	private int event_status;
	
	public int getEvent_status() {
		return event_status;
	}
	public void setEvent_status(int event_status) {
		this.event_status = event_status;
	}
	public Date getEventdate() {
		return eventdate;
	}
	public void setEventdate(Date eventdate) {
		this.eventdate = eventdate;
	}
	private int event_id;
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	private String email_id;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	private String event_name;
private String file_path;
private String Event_description;
public String getFile_path() {
	return file_path;
}
public void setFile_path(String file_path) {
	this.file_path = file_path;
}
public String getEvent_name() {
	return event_name;
}
public void setEvent_name(String event_name) {
	this.event_name = event_name;
}
public String getEvent_description() {
	return Event_description;
}
public void setEvent_description(String event_description) {
	Event_description = event_description;
}
}
