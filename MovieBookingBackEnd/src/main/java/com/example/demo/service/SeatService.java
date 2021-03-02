package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.classes.MySeat;
import com.example.demo.dao.SeatRepo;
import com.example.demo.modal.Seat;

@Service
public class SeatService {

	@Autowired
	SeatRepo seatRepo;

	public List<MySeat> GetListOfSeats(Integer showid) 
	{
		System.out.println("showid:"+showid);
		List<Seat> seats = seatRepo.findAllByMovieShow(showid);
		
		List<MySeat> showSeats = new ArrayList<MySeat>();
		for(Seat seat : seats)
		{
			MySeat mySeat = new MySeat();
			mySeat.setSeatId(seat.getSeatId());
			mySeat.setIsBooked(seat.getIsBooked());
			mySeat.setSeatNumber(seat.getSeatNumber());
//			System.out.println(seat);
			showSeats.add(mySeat);
		}
		
		return showSeats;		
	}

	public List<MySeat> setSeat(List<MySeat> seats) 
	{
		Seat mySeat = new Seat();
		for(MySeat seat : seats)
		{
			System.out.println();
//			
//			System.out.println(seat);
//			System.out.println(seat.getSeatId());
//			
			seatRepo.bookSeat(seat.getSeatId());
			
			mySeat = seatRepo.getOne(seat.getSeatId());
		}
		
		
		List<MySeat> mySeatList = GetListOfSeats(mySeat.getMovieShow().getShowId());
		
		return mySeatList;
	}
	
	
	
}
