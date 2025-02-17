package com.example.demo.controllers;

import com.example.demo.dtos.CustomerResponse;
import com.example.demo.services.CustomerServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CustomerController {
	private  final CustomerServiceImpl service;

	public CustomerController(CustomerServiceImpl service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<CustomerResponse>> getAllCustomers(){
		List<CustomerResponse> customerResponseList = service.getAllCustomers();
		return ResponseEntity.ok(customerResponseList);
	}

}
