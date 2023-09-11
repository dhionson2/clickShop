package com.clickshop.shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickshop.shop.entities.Compra;
import com.clickshop.shop.repositories.CompraRepository;


@Service
public class CompraService {
	@Autowired
	private CompraRepository compraRepository;
	
	
	public List <Compra> findAll(){
		return compraRepository.findAll();
	}
	
	public Compra findbyId(Long id) {
		Optional<Compra> obj = compraRepository.findById(id);
		return obj.get();
	}
}
