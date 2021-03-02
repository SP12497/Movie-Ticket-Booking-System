package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ScreenRepo;
import com.example.demo.dao.TheatreRepo;
import com.example.demo.modal.Screen;
import com.example.demo.modal.Theatre;

@Service
public class TheatreService {
	
	@Autowired
	TheatreRepo theatreRepo;
	
	@Autowired
	ScreenRepo screenRepo;

	public List<Theatre> fetchByZipcode(Integer zipcode)
	{
		return theatreRepo.oncat(zipcode);		
	}
	
	public void AddTheatreRepo( )
	{	

		
String theatrename = "SagarTheatre";
		Integer zipcode = 556644;		//check that its available in city table;
		Integer totalscreens = 6;
		int[] totalSeatsArray = new int[]{ 44,25,55,33,44,55}; 
		

		
		
		
		
		//--------------------

	//Theater :
		theatreRepo.insertTheatreByParam( theatrename ,  totalscreens , zipcode );
	//Screens :
		Theatre theatre = theatreRepo.findByTheatreName(theatrename);
		
		for (int i = 1; i <= totalscreens; i++) 
		{
			Integer totalNoOfSeats = totalSeatsArray[i-1]; 
		
			Screen screen = new Screen();
			screen.setTotalNoOfSeats(totalNoOfSeats);
			
			screen.setScreenName("Screen"+i);
			
			screen.setTheatre(theatre);
			
			screenRepo.save(screen);	
		
		//Seats :
//			for (int j = 1; j <= totalNoOfSeats; j++) 
//			{				
//				Seat seat = new Seat();
//				seat.setScreen(screen);
//				seat.setSeatNumber(j);
//				
//				seatRepo.save(seat);
//			}	
		}
	}
}
