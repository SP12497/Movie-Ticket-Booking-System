package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MoviesRepo;
import com.example.demo.modal.City;
import com.example.demo.modal.Movies;

@Service
public class MovieService
{

	@Autowired
	MoviesRepo repo;
	
	
	
	public List<Movies> addMovie(List<Movies> movies) 
	{
		for (Movies movie : movies) {
			repo.save(movie);
			System.out.println(movie);
		}
		return  movies;
	}


	public List<Movies> getMovieList() 
	{
		
		
		List<Movies> mymovies = repo.findAll(City.getStaticCity());
		// movies.forEach(System.out::println);'
		 
		return mymovies;
		 
	}
	
	

}
