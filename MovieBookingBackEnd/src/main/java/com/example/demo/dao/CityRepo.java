package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.City;

public interface CityRepo extends JpaRepository<City, Integer> {

//	public City findByCity(String city);
	
	@Query("from City")
	public List<City> oncat(String city);
	
	//public List<City> FindByCityName(String cityname);

}
