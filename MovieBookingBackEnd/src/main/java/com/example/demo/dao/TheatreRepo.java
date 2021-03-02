package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.Theatre;

public interface TheatreRepo extends JpaRepository<Theatre,String> {

	@Query("from Theatre where city_zipcode = :x")
	List<Theatre> oncat(@Param("x") Integer zipcode);
	
	
	
	@Transactional
	@Modifying
	@Query(value="insert into theatre (  theatrename , totalscreens , zipcode ) VALUES ( :theatrename , :totalNoOfScreens , :zipcode )" , nativeQuery = true)
	List insertTheatreByParam(@Param("theatrename") String theatrename , @Param("totalNoOfScreens") Integer totalNoOfScreens , @Param("zipcode") Integer zipcode );



	Theatre findByTheatreName(String theatrename);

	
	
	
	

	
}
