package com.example.demo.classes;



public class MySeat
{
	Integer seatId;
	
	Integer seatNumber;
	
	Boolean isBooked ;

	
	
	
	
	public MySeat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MySeat(Integer seatId, Integer seatNumber, Boolean isBooked) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.isBooked = isBooked;
	}

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	public Integer getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Boolean getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}

	@Override
	public String toString() {
		return "MySeat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", isBooked=" + isBooked + "]";
	}
	
	
	

}
