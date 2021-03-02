package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classes.DateMovie;
import com.example.demo.classes.MovieDummy;
import com.example.demo.classes.ShowData;
import com.example.demo.classes.ShowDetails;
import com.example.demo.modal.MovieShow;
import com.example.demo.service.MovieShowService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MovieShowController 
{
	
	@Autowired
	MovieShowService showservice;
	
	@PostMapping("/addshow")
	List<ShowData> addMovieShow(@RequestBody List<ShowData> showdata)
	{				
		return showservice.addShow(showdata);
	}
		
	
	@PostMapping("/listofdates")
	List<Date> getDateLists(@RequestBody MovieDummy movie)
	{
		System.out.println(movie);
		System.out.println("listofdates movieid : "+ movie.getMovieId());
		
		return showservice.searchShowByMovie(movie.getMovieId());		
	}
	
	@PostMapping("/getShowsByMovies")
	List<ShowDetails> getShowsByMovies(@RequestBody DateMovie datemovie)
	{
	
		System.out.println(datemovie);
		
		return showservice.getShowsByMovies(datemovie);
	}

}
