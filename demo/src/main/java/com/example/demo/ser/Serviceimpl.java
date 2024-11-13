package com.example.demo.ser;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;
import com.example.demo.repo.Repo;

@Service
public class Serviceimpl implements Servicei{
	@Autowired
      private Repo repo;
	public String postUser(Userdto dto) {
		Optional<User> us=repo.findByUserName(dto.getUserName());
		User usr=new User();
		
		usr.setUserId(dto.getUserId());
		usr.setUserName(dto.getUserName());
		repo.save(usr);
		return "success";
	}

}
