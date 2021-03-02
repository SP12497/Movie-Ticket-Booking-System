package com.example.demo.modal;


import java.util.Date;

import javax.persistence.*;

@Entity
public class Movies
{
	@Id
	@Column(name = "movieid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer movieId;
	
	@Column(name = "title", length=100 , nullable = false)
	String title;
	
	@Column(name = "description", length=800 , nullable = false)
	String description;
	
	@Temporal(TemporalType.TIME)
	Date duration;
	
	@Column(length = 50 )
	String language;
		
	@Column(length = 200 )
	String type;
	
	@Column(length = 500 )
	String image;
	
	
	Double rating;
	
	@Column(length=300)
	String trailer;

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

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", title=" + title + ", description=" + description + ", duration="
				+ duration + ", language=" + language + ", type=" + type + ", image=" + image + ", rating=" + rating
				+ ", trailer=" + trailer + "]";
	}

	public Movies(Integer movieId, String title, String description, Date duration, String language, String type,
			String image, Double rating, String trailer) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.language = language;
		this.type = type;
		this.image = image;
		this.rating = rating;
		this.trailer = trailer;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

	
	
	
	
}
