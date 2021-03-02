package com.example.demo.modal;

import javax.persistence.*;

@Entity
public class Seat
{
	@Id
	@Column(name = "seatid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer seatId;
	
	@Column(name = "seatnumber")
	Integer seatNumber;
	
	@Column(name = "isbooked")
	Boolean isBooked = false;
	
	@ManyToOne
	@JoinColumn(name= "screenid" ,referencedColumnName = "screenid")
	Screen screen;
	
	@ManyToOne
	@JoinColumn(name= "showid" ,referencedColumnName = "showid")
	MovieShow movieShow;
	
	
	
	
	

	
	
	
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", isBooked=" + isBooked + ", screen=" + screen
				+ ", movieShow=" + movieShow + "]";
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

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public MovieShow getMovieShow() {
		return movieShow;
	}

	public void setMovieShow(MovieShow movieShow) {
		this.movieShow = movieShow;
	}

	public Seat(Integer seatId, Integer seatNumber, Boolean isBooked, Screen screen, MovieShow movieShow) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.isBooked = isBooked;
		this.screen = screen;
		this.movieShow = movieShow;
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

		
}
