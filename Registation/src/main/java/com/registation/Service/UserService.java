package com.registation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registation.Entity.User;
import com.registation.Entity.UserDto;
import com.registation.Repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository repo;
	public void saveUser(UserDto userdto){
       User us=new User();
		
		us.setUserId(userdto.getUserId());
		us.setUserName(userdto.getUserName());
		us.setMobileNumber(userdto.getMobileNumber());
		us.setEmail(userdto.getEmail());
		repo.save(us);
	}
	
	
	
	
	
	
	
	
	
	
}
