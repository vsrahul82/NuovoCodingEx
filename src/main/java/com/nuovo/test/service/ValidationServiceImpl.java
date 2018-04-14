package com.nuovo.test.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService{

	public boolean validatePassword(String password){
		
		
		if(!isLowerCaseLetterOrDigitAndLength(password)){
			return false;
		}
		
		if(isSequenceRepeated(password)){
			return false;
		}
		return true;
		
	}

	public boolean isSequenceRepeated(String password) {

		if(password.matches("(\\w+)\\1")){
			return true;
		}
		
		return false;
	}

	public boolean isLowerCaseLetterOrDigitAndLength(String password) {
       /*
		if (password.matches("[a-z0-9]"))
			return true;
		*/
		if(password.matches("(?!^[0-9]*$)(?!^[a-z]*$)^([a-z0-9]{5,12})$"))
			return true;
		
		return false;
	}
	
}
