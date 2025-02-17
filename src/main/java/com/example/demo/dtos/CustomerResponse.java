package com.example.demo.dtos;

public record CustomerResponse(
		Long id,
		String name,
		String email,
		String phone
) {
}
