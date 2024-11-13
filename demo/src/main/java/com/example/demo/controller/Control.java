package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;
import com.example.demo.ser.Serviceimpl;


@RestController
@RequestMapping("/base")
public class Control {
	@Autowired
	private Serviceimpl ser;
    @PostMapping("/post")
	public void postUser(@RequestBody Userdto dto) {
		
		
		ser.postUser(dto);
	System.out.println(ser);
		
		
		
	}
	
}
