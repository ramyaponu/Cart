package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

@Repository
public interface Repo extends JpaRepository<User,Integer>{

	Optional<User> findByUserName(String userName);

	

	

	
}
