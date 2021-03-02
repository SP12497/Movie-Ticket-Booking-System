package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ResistrationRepo;
import com.example.demo.modal.User;
import com.example.demo.service.RegistrationService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
public class RegistrationController
{
	@Autowired
	RegistrationService service;



	@PostMapping("/register")
	public User registerUser(@RequestBody User user)
	{
//		System.out.println("Registering... User ID : " + user.getUserName());
		
		User userObj= null;
		
		userObj = this.service.saveUser(user);
		
		return userObj;
	}
	

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmail();
		String tempPassword = user.getUserPassword();
		
//		System.out.println( "Email : "+ tempEmailId + "Password : " + tempPassword);
		
		User userObj = null;
		
		if(tempEmailId !=null && tempPassword !=null)
		{
			userObj = service.fetchUserByEmailAndUserPassword(tempEmailId , tempPassword);	
		}
		if(userObj == null) {
			throw new Exception("Bad Credentials");
		}
		
		return userObj;
	}

	
	
	
//	@GetMapping(path="/users")
//	public List<User> getAliens()
//	{
//		return repo.findAll();
//			
//	}
//
//	@PutMapping(path="/user")
//	public User saveOrUpdateAlien(@RequestBody User user)
//	{
//		repo.save(user);
//		return user;
//	}
//	
//	
//	@RequestMapping("/user/{userId}")
//	public Optional<User> getAlien(@PathVariable("aid")int userId)
//	{
//		return repo.findById(userId);
//		
//		
//	}
//
//	@DeleteMapping("/user/{userId}")
//	public String deleteAlien(@PathVariable int userId)
//	{
//		User a = repo.getOne(userId);
//		repo.delete(a);
//		return "deleted";
//	}

	//	@RequestMapping("/")
//	public String home()
//	{
//		return "home.jsp";
//	}
	
}
