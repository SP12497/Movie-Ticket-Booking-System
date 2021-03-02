package com.example.demo.classes;

import java.time.LocalDate;


public class DateMovie 
{
	LocalDate  date;
	
	Integer movieid;

	

	public Integer getMovieid() {
		return movieid;
	}

	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}

	public DateMovie(LocalDate date, Integer movieid) {
		super();
		this.date = date;
		this.movieid = movieid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public DateMovie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DateMovie [date=" + date + ", movieid=" + movieid + "]";
	}
	
	

}
