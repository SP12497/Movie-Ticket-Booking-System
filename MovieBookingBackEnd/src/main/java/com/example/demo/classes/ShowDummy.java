package com.example.demo.classes;

import java.time.LocalTime;

public class ShowDummy {

    Integer showId;
	
	LocalTime startTime;
	
	String screenName;
	
	Integer screenId;
	
	Double price;
	
	
	
	
	
	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ShowDummy(Integer showId, LocalTime startTime, String screenName, Integer screenId, Double price) {
		super();
		this.showId = showId;
		this.startTime = startTime;
		this.screenName = screenName;
		this.screenId = screenId;
		this.price = price;
	}

	public ShowDummy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ShowDummy [showId=" + showId + ", startTime=" + startTime + ", screenName=" + screenName + ", screenId="
				+ screenId + ", price=" + price + "]";
	}

	
	
}
