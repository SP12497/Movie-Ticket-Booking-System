package com.example.demo.classes;

import java.util.Date;

public class ShowDetails
{
	Date startTime;
	
	String screenName;
	
	Integer screenid;
	
	String theatreName;
	
	Double price;
	
	Integer showId;
	
	
	

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Integer getScreenid() {
		return screenid;
	}

	public void setScreenid(Integer screenid) {
		this.screenid = screenid;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ShowDetails(Date startTime, String screenName, Integer screenid, String theatreName, Double price) {
		super();
		this.startTime = startTime;
		this.screenName = screenName;
		this.screenid = screenid;
		this.theatreName = theatreName;
		this.price = price;
	}

	public ShowDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ShowDetails [startTime=" + startTime + ", screenName=" + screenName + ", screenid=" + screenid
				+ ", theatreName=" + theatreName + ", price=" + price + "]";
	}


	
	
	
	
	
	
	
}
