package com.tirmizee.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDTO implements Serializable {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	
}
