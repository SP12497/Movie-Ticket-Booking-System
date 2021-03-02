package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityRepo;
import com.example.demo.modal.City;

@Service
public class CityService 
{
	@Autowired
	CityRepo repo;
	
	public List<City> fetchByCityName(String city)
	{
		
		return repo.oncat(city);
		
	}

	
	
}
