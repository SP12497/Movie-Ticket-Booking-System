package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classes.SetCity;
import com.example.demo.modal.City;
import com.example.demo.service.CityService;


@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class CityController {

	@Autowired
	CityService service;
	
	
//	public Integer zcode;
	
	@GetMapping("/city")
	public List<City> fetchByCityName(String city)
	{
		return this.service.fetchByCityName(city);
	}
	
	@PostMapping("/setcity")
	public SetCity setCity(SetCity city)
	{
		System.out.println(city);
		City.setStaticCity(city.getCityname());
		
		System.out.println(City.getStaticCity());
		
		return city;
	}
	
	@GetMapping("checklocation")
	Boolean checkLocation()
	{
		if (City.getStaticCity() != "") 
		{
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
