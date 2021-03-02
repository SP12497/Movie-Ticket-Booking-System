package com.example.demo.classes;


import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class MovieDummy {

	Integer movieId;

	String title;

	String description;

	LocalTime duration;

	String language;

	String type;

	Double rating;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public MovieDummy(Integer movieId, String title, String description, LocalTime duration, String language,
			String type, Double rating) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.language = language;
		this.type = type;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieDummy [movieId=" + movieId + ", title=" + title + ", description=" + description + ", duration="
				+ duration + ", language=" + language + ", type=" + type + ", rating=" + rating + "]";
	}

	public MovieDummy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	


}
