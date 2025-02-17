package com.example.demo.services;

import com.example.demo.dtos.CustomerResponse;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
	private final CustomerRepository repository;

	public CustomerServiceImpl(CustomerRepository repository) {
		this.repository = repository;
	}

	public List<CustomerResponse> getAllCustomers() {
		return repository.findAll()
				       .stream()
				       .map(
						       customer -> new CustomerResponse(
								       customer.getId(),
								       customer.getName(),
								       customer.getEmail(),
								       customer.getPhone()
						       )
				       )
				       .collect(Collectors.toList());
	}

}
