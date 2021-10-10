package com.Bar.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bar.covid.dto.UserDTO;
import com.Bar.covid.model.User;
import com.Bar.covid.modelToForm.ModelToForm;
import com.Bar.covid.repository.UserRepository;



@RestController
@RequestMapping("/api")
public class CovidController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelToForm mtf;
	
	
	@PostMapping("/addUser")
	public UserDTO getUserId(@RequestBody User user) {
		
		User user1 = new User();
		UserDTO u1 = new UserDTO();
		user1 = userRepo.save(user);
		u1 = mtf.getUSerId(user1);
		
		return u1;
		
	}

}
