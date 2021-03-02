package com.example.demo.classes;

public class MyShowId {
	
	//We dont need this class

	Integer showId;

	public Integer getShowId() {
		return showId;
	}
	
	
	
	
	
	

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	@Override
	public String toString() {
		return "MyShowId [showId=" + showId + "]";
	}

	public MyShowId(Integer showId) {
		super();
		this.showId = showId;
	}

	public MyShowId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
