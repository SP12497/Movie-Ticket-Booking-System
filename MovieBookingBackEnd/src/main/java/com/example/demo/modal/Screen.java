package com.example.demo.modal;

import javax.persistence.*;


@Entity
public class Screen 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "screenid")
	Integer screenId;
	
	@Column(name = "screenname")
	String screenName;
	
	@Column(name="totalnoofseats")
	Integer totalNoOfSeats;
	
	@ManyToOne
	@JoinColumn(name= "theatreid" ,referencedColumnName = "theatreid")
	Theatre theatre;
	
	
	

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Integer getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(Integer totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public Screen(Integer screenId, String screenName, Integer totalNoOfSeats, Theatre theatre) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.totalNoOfSeats = totalNoOfSeats;
		this.theatre = theatre;
	}

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", totalNoOfSeats=" + totalNoOfSeats
				+ ", theatre=" + theatre + "]";
	}

	
	

		
	
}
