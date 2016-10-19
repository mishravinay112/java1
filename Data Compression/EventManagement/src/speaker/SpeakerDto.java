package speaker;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import events.EventDto;

@Entity
@Table(name="speaker")
public class SpeakerDto {

	@Id
	@Column(name="speaker_id")
	private int speaker_id;
	
	private String speaker_name;
	
	@ManyToMany(targetEntity=EventDto.class,cascade=CascadeType.ALL)
	@JoinTable(name="events_speaker",joinColumns=@JoinColumn(name="speaker_id_fk",referencedColumnName="speaker_id"),inverseJoinColumns=@JoinColumn(name="event_id_fk",referencedColumnName="eventid"))
	private Set<EventDto> event;

	public int getSpeaker_id() {
		return speaker_id;
	}

	public void setSpeaker_id(int speaker_id) {
		this.speaker_id = speaker_id;
	}

	public String getSpeaker_name() {
		return speaker_name;
	}

	public void setSpeaker_name(String speaker_name) {
		this.speaker_name = speaker_name;
	}

	public Set<EventDto> getEvent() {
		return event;
	}

	public void setEvent(Set<EventDto> event) {
		this.event = event;
	}
	
	
}
