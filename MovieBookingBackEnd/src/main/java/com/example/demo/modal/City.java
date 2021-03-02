package com.example.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.context.support.StaticApplicationContext;

@Entity
public class City 
{
	
	@Transient
	static String staticCity="";

	@Id
	public Integer zipcode;
	
	@Column(name="cityname", unique = true)
	public String cityname;
	
	public String state;
		
	
	
	
	
	
	
	public static String getStaticCity() {
		return staticCity;
	}
	public static void setStaticCity(String staticCity) {
		City.staticCity = staticCity;
	}
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
	
	public City() {
		
	}
	public City(Integer zipcode, String cityname, String state) {
		super();
		this.zipcode = zipcode;
		this.cityname = cityname;
		this.state = state;
	}
	@Override
	public String toString() {
		return "City [zipcode=" + zipcode + ", cityname=" + cityname + ", state=" + state + "]";
	}
	
	
	
	
	

}
