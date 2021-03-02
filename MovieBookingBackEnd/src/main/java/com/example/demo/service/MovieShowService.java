package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.classes.DateMovie;
import com.example.demo.classes.ShowData;
import com.example.demo.classes.ShowDetails;
import com.example.demo.dao.MovieShowRepo;
import com.example.demo.dao.MoviesRepo;
import com.example.demo.dao.ScreenRepo;
import com.example.demo.dao.SeatRepo;
import com.example.demo.modal.MovieShow;
import com.example.demo.modal.Movies;
import com.example.demo.modal.Screen;
import com.example.demo.modal.Seat;

@Service
public class MovieShowService
{
	@Autowired
	MovieShowRepo movieshowrepo;
	
	@Autowired
	ScreenRepo screenrepo;
	
	@Autowired
	MoviesRepo movierepo;
	
	@Autowired
	SeatRepo seatRepo;
	
	
	public List<ShowData> addShow(List<ShowData> showsdatas) 
	{
		
		for(ShowData showdata : showsdatas) {
			
			MovieShow show = new MovieShow();
			
			show.setDate(showdata.getDate());
			show.setStartTime(showdata.getTime());
			show.setPrice(showdata.getPrice());
			
			Screen screen = screenrepo.getOne(showdata.getScreenid());
			Movies movie = movierepo.getOne(showdata.getMovieid());
			
			show.setScreen(screen);
			show.setMovie(movie);
			
			
			System.out.println(show);
			
			MovieShow movieShowDb = movieshowrepo.save(show);
			
			//Seats :
			for (int j = 1; j <= screen.getTotalNoOfSeats(); j++) 
			{				
				Seat seat = new Seat();
				seat.setSeatNumber(j);
				seat.setScreen(screen);
				seat.setMovieShow(movieShowDb);
				
				seatRepo.save(seat);
			}	

		}
		
		return showsdatas;
	
		
	}


	
	


	public List<Date> searchShowByMovie(Integer movieid) 	//1
	{
		
		List<Date> showsDate = movieshowrepo.findAllByMovie(movieid);
		System.out.println(showsDate);
		
		return showsDate;
		

	}


	public List<ShowDetails> getShowsByMovies(DateMovie datemovie)
	{
		
	//List<show> listOfShow = Search Date AND MovieId :
		List<MovieShow> shows = movieshowrepo.findAllByDateAndMovieid(datemovie.getDate() , datemovie.getMovieid());
		shows.forEach(System.out::println);
			
		List<ShowDetails> showDetails = new ArrayList<>();
		
		System.out.println();
			
		for (MovieShow show : shows) 
		{
			ShowDetails obj = new ShowDetails();
			obj.setShowId(show.getShowId());
			obj.setStartTime(show.getStartTime());
			obj.setScreenid(show.getScreen().getScreenId());
			obj.setPrice(show.getPrice());
			obj.setTheatreName(show.getScreen().getTheatre().getTheatreName());
			obj.setScreenName(show.getScreen().getScreenName());
			
//			System.out.println(show);
//			System.out.println(obj);
			
			showDetails.add(obj);
			
		}
		
		return showDetails;
	
	//
		
	
	}
	

}
