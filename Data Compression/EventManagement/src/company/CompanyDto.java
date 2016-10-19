package company;

import java.util.Set;

import javax.persistence.*;

import events.EventDto;
@Entity 
@Table (name="Company")
public class CompanyDto {
	@Id
	@Column(name="com_id")
	private int company_id;
	
	@Column(name="name")
	private String company_name;
	
	  @OneToMany(targetEntity=EventDto.class, cascade=CascadeType.ALL)
	  @JoinColumn(name = "com_id", referencedColumnName="com_id")
	private Set<EventDto> event;
	
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Set<EventDto> getEvent() {
		return event;
	}
	public void setEvent(Set<EventDto> event) {
		this.event = event;
	}
}
