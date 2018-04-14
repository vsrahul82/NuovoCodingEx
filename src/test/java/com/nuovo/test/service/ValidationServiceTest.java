package com.nuovo.test.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ValidationServiceTest {
	
	@TestConfiguration
	static class ValidationServiceTestConfiguration{
		
		@Bean
		public ValidationService validationService(){
			return new ValidationServiceImpl();
		}
	}
	
	@Autowired
	private ValidationService validationService;
	
	@Test
	public void testLowercaseordigitandlength(){
		assertTrue(validationService.isLowerCaseLetterOrDigitAndLength("password1"));
		assertFalse(validationService.isLowerCaseLetterOrDigitAndLength("Password"));
		assertFalse(validationService.isLowerCaseLetterOrDigitAndLength("123"));
		assertFalse(validationService.isLowerCaseLetterOrDigitAndLength("pw23"));
		
	}
	
	@Test
	public void testSequence(){
		assertTrue(validationService.isSequenceRepeated("passpass"));
		assertFalse(validationService.isSequenceRepeated("passport"));
		
	}

}
