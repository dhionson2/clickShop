package com.clickshop.shop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clickshop.shop.entities.Compra;
import com.clickshop.shop.services.CompraService;

@RestController
@RequestMapping(value="/compras")
public class CompraResource {
	
	@Autowired
	private CompraService compraService;

	@GetMapping
	public ResponseEntity<List<Compra>> findAll(){
		List <Compra> list = compraService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Compra> findById(@PathVariable Long id){
		Compra obj = compraService.findbyId(id);
		return ResponseEntity.ok().body(obj);
	}
}
