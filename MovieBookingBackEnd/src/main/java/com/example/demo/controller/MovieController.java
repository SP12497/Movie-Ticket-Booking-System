package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Movies;
import com.example.demo.service.MovieService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MovieController
{
	@Autowired
	MovieService movieService;
	
	
	@PostMapping("/addmovie")
	List<Movies> addMovie(@RequestBody List<Movies> movies)
	{
		System.out.println("addMovie fun called");
//		System.out.println(movies);
		return movieService.addMovie(movies);
	}
	
	@GetMapping("/getmovielist")
	List<Movies> getMovieList()
	{
		return movieService.getMovieList();
	}
	
	

}
