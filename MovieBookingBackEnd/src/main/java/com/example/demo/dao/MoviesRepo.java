package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.Movies;


public interface MoviesRepo extends JpaRepository<Movies, Integer> {

	@Transactional
	@Modifying
	@Query(value="SELECT * from movies where movieid IN (select movieid from movieshow where date > now() )", nativeQuery = true)
	List<Movies> findAll(@Param("currentcity") String city);
}
