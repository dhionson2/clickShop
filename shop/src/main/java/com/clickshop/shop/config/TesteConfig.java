package com.clickshop.shop.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.clickshop.shop.entities.User;
import com.clickshop.shop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("Johnson Borj", "jons.johnson@gmail.com", "988888888", "senha123");
		User u2 = new User("Anderson Silva", "silva.anderson@gmail.com", "977777777", "senha456");
		User u3 = new User("John Smith", "john@gmail.com", "966666666", "senha789");


		userRepository.saveAll(Arrays.asList(u1,u2,u3));
	}
}
