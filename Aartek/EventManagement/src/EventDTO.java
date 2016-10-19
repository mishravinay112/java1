

import java.util.Set;
import javax.persistence.*;

import attendies.AttendiesDto;
import company.CompanyDto;
import location.LocationDto;
import manager.ManagerDto;
import speaker.SpeakerDto;

@Entity 
@Table(name = "Events")
public class EventDto {

	@Id
	@Column(name = "eventid")
	private int event_id;
	
	@Column(name="name")
	private String event_name;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity=CompanyDto.class)
	@JoinColumn(name="com_id",referencedColumnName="com_id")
	private CompanyDto c;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity=LocationDto.class)
	@JoinColumn(name="loca_id",referencedColumnName="loc_id")
	private LocationDto l;
	
	@OneToOne(targetEntity=ManagerDto.class,cascade=CascadeType.ALL)
	@JoinColumn(name="manager_id",referencedColumnName="man_id")
	private ManagerDto m;
	
	@ManyToMany(targetEntity=AttendiesDto.class,cascade=CascadeType.ALL)
	@JoinTable(name="events_attendies",joinColumns=@JoinColumn(name="event_id_fk",referencedColumnName="eventid"),inverseJoinColumns=@JoinColumn(name="attendies_id_fk",referencedColumnName="attendies_id"))
	private Set<AttendiesDto> attendies;
	
	@ManyToMany(targetEntity=SpeakerDto.class,cascade=CascadeType.ALL)
	@JoinTable(name="events_speaker",joinColumns=@JoinColumn(name="event_id_fk",referencedColumnName="eventid"),inverseJoinColumns=@JoinColumn(name="speaker_id_fk",referencedColumnName="speaker_id"))
	private Set<SpeakerDto> speaker;
	
	
	public CompanyDto getC() {
		return c;
	}
	public void setC(CompanyDto c) {
		this.c = c;
	}
	public Set<SpeakerDto> getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Set<SpeakerDto> speaker) {
		this.speaker = speaker;
	}
	public Set<AttendiesDto> getAttendies() {
		return attendies;
	}
	public void setAttendies(Set<AttendiesDto> attendies) {
		this.attendies = attendies;
	}
	
	public LocationDto getL() {
		return l;
	}
	public ManagerDto getM() {
		return m;
	}
	public void setM(ManagerDto m) {
		this.m = m;
	}
	public void setL(LocationDto l) {
		this.l = l;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
}
