package com.example.demo.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.MovieShow;
import com.example.demo.modal.User;


public interface MovieShowRepo extends JpaRepository<MovieShow, Integer> 
{
	
	@Transactional
	@Modifying
	@Query(value="SELECT DISTINCT(date) FROM movieshow WHERE date > now() AND movieid = :movieid ORDER BY date " , nativeQuery = true)
	List<Date> findAllByMovie(@Param("movieid") Integer movieid);


	@Transactional
	@Modifying
	@Query(value="select * from movieshow where date = :date AND  movieid = :movieid " , nativeQuery = true)
	List<MovieShow> findAllByDateAndMovieid(@Param("date") LocalDate date, @Param("movieid") Integer movieid);

	


}
