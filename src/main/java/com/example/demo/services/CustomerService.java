package com.example.demo.services;

import com.example.demo.dtos.CustomerResponse;
import com.example.demo.models.Customer;

import java.util.List;

public interface CustomerService {
	List<CustomerResponse> getAllCustomers();
}
