package com.oadya.springbootsecurityjwt.dto;

import lombok.Data;

@Data
public class AuthenticationResponse {
	
	private String jwt;

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

}
