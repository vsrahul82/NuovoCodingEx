package com.nuovo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovo.test.service.ValidationServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	private ValidationServiceImpl validationService;

	@GetMapping("/validate")
	public ResponseEntity<String> validatePassword(String password){
		return new ResponseEntity<String>("Password is Valid : " + validationService.validatePassword(password), HttpStatus.OK);
	}
}
