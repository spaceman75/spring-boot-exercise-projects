package com.example.lombok.dto;

import com.example.lombok.model.User;

public record UserDetailsDto(
	Long id,
	String firstName,
	String lastName,
	Integer age,
	String email,
	Boolean isActive
) {
	
	// Constructors

	public UserDetailsDto(User user) {
		this(
			user.getId(), 
			user.getFirstName(), 
			user.getLastName(), 
			user.getAge(), 
			user.getEmail(), 
			user.getIsActive()
		);
	}
}
