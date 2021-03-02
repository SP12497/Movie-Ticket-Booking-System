package com.example.demo.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.Seat;

public interface SeatRepo extends JpaRepository<Seat, Integer> 
{

	
	@Query(value="SELECT * FROM seat WHERE showid = :showid" , nativeQuery = true)
	List<Seat> findAllByMovieShow(@Param("showid") Integer showid);

	
	@Transactional
	@Modifying
	@Query(value="UPDATE seat SET isbooked = true WHERE seatid = :seatid" , nativeQuery = true)
	void bookSeat(@Param("seatid") Integer seatId);

}
