package com.Techforge.EasyHire.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private boolean isongoing;
	
	private boolean iscompleted;
	
	private String work_location;
	
	@OneToOne
	private Labour labour;
	
	@OneToOne
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isIsongoing() {
		return isongoing;
	}

	public void setIsongoing(boolean isongoing) {
		this.isongoing = isongoing;
	}

	public boolean isIscompleted() {
		return iscompleted;
	}

	public void setIscompleted(boolean iscompleted) {
		this.iscompleted = iscompleted;
	}

	public String getWork_location() {
		return work_location;
	}

	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}

	public Labour getLabour() {
		return labour;
	}

	public void setLabour(Labour labour) {
		this.labour = labour;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Job(boolean isongoing, boolean iscompleted, String work_location, Labour labour, User user) {
		this.isongoing = isongoing;
		this.iscompleted = iscompleted;
		this.work_location = work_location;
		this.labour = labour;
		this.user = user;
	}
	
	
	

}
