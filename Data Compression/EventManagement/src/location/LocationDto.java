package location;

import javax.persistence.*;

@Entity
@Table(name="Location")
public class LocationDto {

	@Id
	@Column(name="loc_id")
	private int location_id;
	
	@Column(name="loc_name")
	private String location_name;
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	
	
}
