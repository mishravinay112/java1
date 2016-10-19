package manager;

import javax.persistence.*;


@Entity
@Table(name="Manager")
public class ManagerDto {
	
	@Id
	@Column(name="man_id")
	private int manager_id;
	
	@Column(name="man_name")
	private String manager_name;

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	
	
	

}
