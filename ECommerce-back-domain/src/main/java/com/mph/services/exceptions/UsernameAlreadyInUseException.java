package com.mph.services.exceptions;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UsernameAlreadyInUseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UsernameAlreadyInUseException() {
		super("This login is already in use. Please choose another.");
	}

}