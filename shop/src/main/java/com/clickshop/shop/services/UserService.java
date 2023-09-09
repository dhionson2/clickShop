package com.clickshop.shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickshop.shop.entities.User;
import com.clickshop.shop.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List <User> findAll(){
		return userRepository.findAll();
	}
	
	public User findbyId(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
