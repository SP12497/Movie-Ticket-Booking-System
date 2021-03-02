package com.example.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Theatre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer theatreid;
	
	@Column(name = "theatrename")
	public String theatreName;
	
	@Column(name = "totalscreens")
	public Integer totalScreens;
	

	@ManyToOne
	@JoinColumn(name = "zipcode", referencedColumnName = "zipcode")
	public City city;
	
	
	
	public Theatre( String theatreName, Integer totalScreens) {
		this.theatreName = theatreName;
		this.totalScreens = totalScreens;
		
	}
	
	
	
	
	
	
	
	



	

	public Integer getTheatreid() {
		return theatreid;
	}













	public void setTheatreid(Integer theatreid) {
		this.theatreid = theatreid;
	}













	public City getCity() {
		return city;
	}













	public void setCity(City city) {
		this.city = city;
	}













	public String getTheatreName() {
		return theatreName;
	}


	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}


	public Integer getTotalScreens() {
		return totalScreens;
	}


	public void setTotalScreens(Integer totalScreens) {
		this.totalScreens = totalScreens;
	}




	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatreName=" + theatreName + ", totalScreens=" + totalScreens
				+ ", city=" + city + "]";
	}

	
	
	
		
	
}
