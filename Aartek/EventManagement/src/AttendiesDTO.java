

import java.util.Set;

import javax.persistence.*;

import events.EventDto;

@Entity
@Table(name="Attendies")
public class AttendiesDto {

	@Id
	private int attendies_id;
	
	
	private String attendies_name;
	
	@ManyToMany(targetEntity=EventDto.class,cascade=CascadeType.ALL)
	@JoinTable(name="events_attendies",joinColumns=@JoinColumn(name="attendies_id_fk",referencedColumnName="attendies_id"),inverseJoinColumns=@JoinColumn(name="event_id_fk",referencedColumnName="eventid"))
	private Set<EventDto> evt;
	
	
	public Set<EventDto> getEvt() {
		return evt;
	}
	public void setEvt(Set<EventDto> evt) {
		this.evt = evt;
	}
	public int getAttendies_id() {
		return attendies_id;
	}
	public void setAttendies_id(int attendies_id) {
		this.attendies_id = attendies_id;
	}
	public String getAttendies_name() {
		return attendies_name;
	}
	public void setAttendies_name(String attendies_name) {
		this.attendies_name = attendies_name;
	}
	
}
