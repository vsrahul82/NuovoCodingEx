package com.nuovo.test.service;

public interface ValidationService {
	
	public boolean validatePassword(String password);
	public boolean isSequenceRepeated(String password) ;
	public boolean isLowerCaseLetterOrDigitAndLength(String password) ;

}
