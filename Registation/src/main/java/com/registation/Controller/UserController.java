package com.registation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registation.Entity.User;
import com.registation.Entity.UserDto;
import com.registation.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;

	@PostMapping("/Register")
	public void registerUser(@RequestBody UserDto userdto) {
		userservice.saveUser(userdto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
