package com.example.demo.classes;

public class SetCity {

	Integer zipcode;
	String cityname;
	String state;
	
	
	
	
	
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "SetCity [cityname=" + cityname + ", zipcode=" + zipcode + ", state=" + state + "]";
	}
	public SetCity(String cityname, Integer zipcode, String state) {
		super();
		this.cityname = cityname;
		this.zipcode = zipcode;
		this.state = state;
	}
	public SetCity() {
		super();
		// TODO Auto-generated constructor stub
	}

		
}
