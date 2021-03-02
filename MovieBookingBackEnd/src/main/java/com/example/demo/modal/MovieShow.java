package com.example.demo.modal;



import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Movieshow")
public class MovieShow 
{
	@Id
	@Column(name = "showid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer showId;
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	@Column(name = "starttime")
	@Temporal(TemporalType.TIME)
	Date startTime;
	
	Double price;
	
	@OneToOne
	@JoinColumn(name= "screenid" ,referencedColumnName = "screenid")
	Screen screen;
	
	@ManyToOne
	@JoinColumn(name= "movieid" ,referencedColumnName = "movieid")
	Movies movie;

	
	
	
	
	public MovieShow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieShow(Integer showId, Date date, Date startTime, Double price, Screen screen, Movies movie) {
		super();
		this.showId = showId;
		this.date = date;
		this.startTime = startTime;
		this.price = price;
		this.screen = screen;
		this.movie = movie;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "MovieShow [showId=" + showId + ", date=" + date + ", startTime=" + startTime + ", price=" + price
				+ ", screen=" + screen + ", movie=" + movie + "]";
	}

}
