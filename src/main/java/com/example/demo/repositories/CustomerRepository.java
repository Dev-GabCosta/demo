package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface CustomerRepository extends JpaRepository<CustomerRepository, Long> {
}
