package com.clickshop.shop.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.clickshop.shop.entities.Compra;
import com.clickshop.shop.entities.User;
import com.clickshop.shop.repositories.CompraRepository;
import com.clickshop.shop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CompraRepository compraRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("Johnson Borj", "jons.johnson@gmail.com", "988888888", "senha123");
		User u2 = new User("Anderson Silva", "silva.anderson@gmail.com", "977777777", "senha456");
		User u3 = new User("John Smith", "john@gmail.com", "966666666", "senha789");
		
		Compra c1 = new Compra(u1, new ArrayList<>(), 0.0, 0.0, 0.0, Instant.parse("2023-08-20T20:50:17Z"));
		Compra c2 = new Compra(u2, new ArrayList<>(), 0.0, 0.0, 0.0, Instant.parse("2023-08-21T13:14:40Z"));
		Compra c3 = new Compra(u3, new ArrayList<>(), 0.0, 0.0, 0.0, Instant.parse("2023-08-22T17:10:12Z"));
		Compra c4 = new Compra(u3, new ArrayList<>(), 0.0, 0.0, 0.0, Instant.parse("2023-08-22T17:10:12Z"));
		Compra c5 = new Compra(u1, new ArrayList<>(), 0.0, 0.0, 0.0, Instant.parse("2023-08-22T17:10:12Z"));
		Compra c6 = new Compra(u3, new ArrayList<>(), 0.0, 0.0, 0.0, Instant.parse("2023-08-22T17:10:12Z"));



		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		compraRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
	}
}
